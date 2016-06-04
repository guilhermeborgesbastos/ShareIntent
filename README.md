# ShareIntent
Share links, app's, text and others from your android APP for any app ( WhatsApp , Facebook , Twitter, Snapchat , among others).

Compartilhe links, app's, textos e outros do seu Aplicativo Android para qualquer app ( WhatsApp , Facebook , Twitter, Snapchat , among others). 

| Gif | Video |
| --- | --- |
| ![ContactPikerAnimated](https://meucomercioeletronico.com/tutorial/share_intent.gif)  | [![VIDEO](https://img.youtube.com/vi/DVrM7Kj_uNw/0.jpg)](https://www.youtube.com/watch?v=DVrM7Kj_uNw) |


## Installation and use / Instalação e uso
Just import the Git project to your editor (Android Studio / Eclipse, etc ...).

Basta importar o projeto do Git para o seu editor ( Android Studio / Eclipse, etc... ).


## Class / Classes
### MainActivity [See File / Visualizar Arquivo](https://github.com/guilhermeborgesbastos/ShareIntent/blob/master/app/src/main/java/guilherme/com/br/shareintent/MainActivity.java)
Main class with the main code.

Classe que possui o código fonte principal.

```
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
```
Layout XML ( MainActivity ): [See file / Visualizar Arquivo](https://github.com/guilhermeborgesbastos/ShareIntent/blob/master/app/src/main/res/layout/activity_main.xml)
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="#fff">



    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:paddingTop="15dp"
        android:paddingBottom="15dp"
        android:background="@drawable/border_bottom"
        android:id="@+id/item_1">

        <ImageView
            android:layout_width="35dp"
            android:layout_height="35dp"
            android:src="@drawable/agenda"
            android:layout_marginLeft="20dp"/>

        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="Adicionar da Agenda de Contatos"
            android:textSize="15sp"
            android:textColor="@color/greyDark"
            android:layout_marginLeft="15dp"
            android:paddingTop="8dp"
            />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:paddingTop="15dp"
        android:paddingBottom="15dp"
        android:background="@drawable/border_bottom"
        android:id="@+id/item_2">

        <ImageView
            android:layout_width="35dp"
            android:layout_height="35dp"
            android:src="@drawable/share"
            android:layout_marginLeft="20dp"/>

        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="Convidar amigos"
            android:textSize="15sp"
            android:textColor="@color/greyDark"
            android:layout_marginLeft="15dp"
            android:paddingTop="8dp" />

    </LinearLayout>

</LinearLayout>
```

``

### Conclusion / Conclusão

With this component can share anything you want.
I hope it helped you!

I am a willingness to ask questions:

guilhermeborgesbastos@gmail.com

Com este componente pode compartilhar o que quiser.
Espero que tenha ajudado!

Fico a disposição para tirar dúvidas:

guilhermeborgesbastos@gmail.com

## Contact / Contato
[![VIDEO](https://media.licdn.com/mpr/mpr/shrinknp_100_100/AAEAAQAAAAAAAAgiAAAAJGMwMTQwNTMyLTU2N2EtNDM1NS1iZDMxLTI2ZjVhZDRlNjM2Mw.jpg)](https://www.facebook.com/AndroidNaPratica)
