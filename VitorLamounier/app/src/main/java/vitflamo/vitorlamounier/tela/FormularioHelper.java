package vitflamo.vitorlamounier.tela;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;


import vitflamo.vitorlamounier.modelo.Aluno;

/**
 * Created by android5908 on 06/04/16.
 */
public class FormularioHelper {
    private EditText nome;
    private EditText telefone;
    private EditText site;
    private SeekBar nota;
    private  EditText endereco;
    private Aluno aluno;

    //Camera
    private ImageView foto;
    private Button fotoButton;

    public FormularioHelper(FormularioActivity activity)
    {

        this.nome = (EditText) activity.findViewById(R.id.nome);
        this.telefone = (EditText) activity.findViewById(R.id.phone);
        this.site = (EditText) activity.findViewById(R.id.site);
        this.nota = (SeekBar) activity.findViewById(R.id.nota);
        this.endereco = (EditText) activity.findViewById(R.id.endereco);
        this.aluno = new Aluno();


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

    public Aluno pegaAlunoDoFormulario()

    {
        aluno.setNome(nome.getText().toString());
        aluno.setEndereco(endereco.getText().toString());
        aluno.setSite(site.getText().toString());
        aluno.setTelefone(telefone.getText().toString());
        aluno.setNota(Double.valueOf(nota.getProgress()));
        //camera
        aluno.setCaminhoFoto((String) foto.getTag());
        return aluno;
    }

    public void colocaNoFormulario (Aluno aluno)

    {

        nome.setText(aluno.getNome());
        telefone.setText(aluno.getTelefone());
        site.setText(aluno.getSite());
        endereco.setText(aluno.getEndereco());
        nota.setProgress(aluno.getNota().intValue()); //e diferente prk e RatingBar ou SeekBar

        this.aluno = aluno;

        //camera

        if (aluno.getCaminhoFoto() != null)
        {
            this.carregaImagem(aluno.getCaminhoFoto());
        }
    }

}
