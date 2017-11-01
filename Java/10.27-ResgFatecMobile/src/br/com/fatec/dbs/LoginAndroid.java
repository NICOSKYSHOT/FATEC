/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.dbs;

import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class LoginAndroid extends AsyncTask<String, String, String>{
        private final String ULOGIN ;
        private final String USENHA ;

        LoginAndroid(String usuario, String senhas) {
            ULOGIN = usuario;
            USENHA = senhas;
        }

        @Override
        protected String doInBackground(String... strings) {

            HttpURLConnection connection = null;
            BufferedReader reader = null;
            Log.d("login", ULOGIN);
            Log.d("senha", USENHA);

            try {


                URL url = new URL("http://192.168.0.87:8080/trabalho_biblioteca/validaLoginAndroid");

                String login = ULOGIN;
                String senha = USENHA;
                Log.d("LOGIN post APP: ",login);
                Log.d("SENHA post APP: ",senha);

                String data = URLEncoder.encode("LOGIN", "UTF-8")
                        + "=" +URLEncoder.encode(login, "UTF-8");
                data += "&" + URLEncoder.encode("SENHA", "UTF-8")
                        + "=" +URLEncoder.encode(senha,"UTF-8");

                Log.d("STRING DATA FORMADA ",data);

                connection = (HttpURLConnection) url.openConnection();

                connection.setDoOutput(true);

                OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());

                wr.write( data );
                wr.flush();

                String response = ""; // variavel que recebe JSON
                InputStream stream = connection.getInputStream();

                reader = new BufferedReader(new InputStreamReader(stream));
                StringBuffer buffer = new StringBuffer();

                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line + "\n");

                }

                response = buffer.toString();
                JSONObject json_object = null;

                json_object = new JSONObject(response); //converte variavel Json para objeto Json
                Log.d("JSON: ", response);
                //String test = (json_object.get("id"));
                Log.d("JSONID: ", String.valueOf(json_object.get("id")));
                Log.d("ADM JSON tipo: ", String.valueOf(json_object.get("tipo")));

                //if ((json_object.get("tipo").equals("ADM"))) {
                //    Intent it = new Intent(LoginActivity.this, MenuActivity.class);
                //    startActivity(it);
                //}

            }
            catch (MalformedURLException e) {
            } catch (IOException e) {
            } catch (JSONException e) {
            }
            finally {
                //    connection.disconnect();
                try {

                    if(reader != null) {
                        reader.close();
                    }
                } catch(IOException e) {

                }

            }



            return null;
        }
}
