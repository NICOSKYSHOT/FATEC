package vitflamo.vitorlamounier.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


import vitflamo.vitorlamounier.R;
import vitflamo.vitorlamounier.bean.Memoria;


public class FormularioHelper {
    private EditText nome;
    private EditText data;
    private EditText info;

    private Memoria memoria;

    //Camera
    private ImageView foto;
    private Button fotoButton;

    public FormularioHelper(FormularioActivity activity){

        this.nome = (EditText) activity.findViewById(R.id.nome);
        this.data = (EditText) activity.findViewById(R.id.data);
        this.info = (EditText) activity.findViewById(R.id.info);
        this.memoria = new Memoria();


        //camera
        foto = (ImageView) activity.findViewById(R.id.formulario_foto);
        fotoButton = (Button) activity.findViewById(R.id.formulario_foto_button);
    }
    //camera
    public Button getFotoButton ()
    {
        return fotoButton;
    }

    //camera
    public void carregaImagem(String localArquivoFoto){
        Bitmap imagemFoto = BitmapFactory.decodeFile(localArquivoFoto);
        Bitmap imagemFotoReduzida = Bitmap.createScaledBitmap(imagemFoto, 400, 300, true);
        foto.setImageBitmap(imagemFotoReduzida);
        foto.setTag(localArquivoFoto);
        foto.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public Memoria pegaMemoriaDoFormulario()    {
        memoria.setNome(nome.getText().toString());
        memoria.setData(data.getText().toString());
        memoria.setInfo(info.getText().toString());
        //camera
        memoria.setCaminhoFoto((String) foto.getTag());
        return memoria;
    }

    public void colocaNoFormulario (Memoria memoria)    {

        nome.setText(memoria.getNome());
        data.setText(memoria.getData());
        info.setText(memoria.getInfo());
        this.memoria = memoria;

        //camera

        if (memoria.getCaminhoFoto() != null)        {
            this.carregaImagem(memoria.getCaminhoFoto());
        }
    }

}
