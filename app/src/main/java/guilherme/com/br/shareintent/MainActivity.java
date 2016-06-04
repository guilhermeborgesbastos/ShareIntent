package guilherme.com.br.shareintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout item_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        item_2 = (LinearLayout) findViewById(R.id.item_2);
        item_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                invokeShare(MainActivity.this);
            }
        });

    }

    //url para download do App por ex.
    private String installUrl = "https://https://www.facebook.com/AndroidNaPratica/";


    //Share Compartilha o Aplicativo
    //TODO: Altere aqui o texto que deseja que seja compartilhado

    public void invokeShare(MainActivity activity) {
        Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        //Titulo ( Title )
        shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "FindMe Aplicativo que facilita sua vida");
        //Conteudo ( Body da message )
        shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Baixe agora o FindMe: " + installUrl);
        //Titulo do Share INTENT
        activity.startActivity(Intent.createChooser(shareIntent, "Compartilhar o FindMe"));
    }

}
