package vitflamo.vitorlamounier.tela;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;


import vitflamo.vitorlamounier.modelo.Cliente;

/**
 * Created by android5908 on 06/04/16.
 */
public class FormularioHelper {
    private EditText nome;
    private EditText telefone;
    private EditText site;
    private EditText endereco;
    private Cliente cliente;

    //Camera
    private ImageView foto;
    private Button fotoButton;

    public FormularioHelper(FormularioActivity activity)
    {

        this.nome = (EditText) activity.findViewById(R.id.nome);
        this.telefone = (EditText) activity.findViewById(R.id.phone);
        this.site = (EditText) activity.findViewById(R.id.site);
        this.endereco = (EditText) activity.findViewById(R.id.endereco);
        this.cliente = new Cliente();


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
    public void carregaImagem(String localArquivoFoto)
    {
        Bitmap imagemFoto = BitmapFactory.decodeFile(localArquivoFoto);
        Bitmap imagemFotoReduzida = Bitmap.createScaledBitmap(imagemFoto, 400, 300, true);
        foto.setImageBitmap(imagemFotoReduzida);
        foto.setTag(localArquivoFoto);
        foto.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public Cliente pegaAlunoDoFormulario()

    {
        cliente.setNome(nome.getText().toString());
        cliente.setEndereco(endereco.getText().toString());
        cliente.setSite(site.getText().toString());
        cliente.setTelefone(telefone.getText().toString());
        //camera
        cliente.setCaminhoFoto((String) foto.getTag());
        return cliente;
    }

    public void colocaNoFormulario (Cliente cliente)

    {

        nome.setText(cliente.getNome());
        telefone.setText(cliente.getTelefone());
        site.setText(cliente.getSite());
        endereco.setText(cliente.getEndereco());

        this.cliente = cliente;

        //camera

        if (cliente.getCaminhoFoto() != null)
        {
            this.carregaImagem(cliente.getCaminhoFoto());
        }
    }

}
