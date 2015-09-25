package com.starksky.kanutalksfr;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Locale;

public class Category extends ActionBarActivity {

    ArrayList<Integer> mThumbids = new ArrayList<>();
    ArrayList<String> imgtexts = new ArrayList<>();
    ArrayList<String> speecharray = new ArrayList<>();
    TextToSpeech t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Intent in = getIntent();
        Bundle bundle = in.getExtras();
        Integer pos = bundle.getInt("case", 0);
        switch (pos) {
            case 0:
                setTitle("Nourritur");
                Integer[] mThumbidfood = {R.drawable.breakfast, R.drawable.lunch,
                        R.drawable.snacks, R.drawable.fruits,
                        R.drawable.icecream, R.drawable.custard,
                        R.drawable.sandwiches};
                String[] imgtextfood = {"Petit déjeuner", "Déjeuner", "Goûter"
                        , "Fruits", "Crême glacée", "Crème dessert",
                        "Sandwich"};
                String[] speechfood = {"Je voudrais un petit déjeuner s'il vous plaît", "Je voudrais déjeuner s'il vous plaît", "Je voudrais un goûter s'il vous plaît ", "Je voudrais des fruits s'il vous plaît ",
                        "Je voudrais de la glace s'il vous plaît ", "Je voudrais de la crème dessert s'il vous plaît ", "Je voudrais un sandwich s'il vous plaît "};
                for (int i = 0; i < mThumbidfood.length; i++) {
                    mThumbids.add(mThumbidfood[i]);
                    imgtexts.add(imgtextfood[i]);
                    speecharray.add(speechfood[i]);

                }
                break;
            case 1:
                //add cases and fill the fields accordingly .
                setTitle("Boissons");
                Integer[] mThumbiddrinks = {R.drawable.water, R.drawable.juice,
                        R.drawable.coffee, R.drawable.tea,
                        R.drawable.milk};
                String[] imgtextdrinks = {"Eau", "Jus de fuits", "Café"
                        , "Thé", "Lait"};
                String[] speechdrinks = {"Puis-je avoir de l'eau?", "Puis-je avoir du jus de fruits?", "Puis-je avoir du café?",
                        "Puis-je avoir du thé?", "Puis-je avoir du lait?"};
                for (int i = 0; i < mThumbiddrinks.length; i++) {
                    mThumbids.add(mThumbiddrinks[i]);
                    imgtexts.add(imgtextdrinks[i]);
                    speecharray.add(speechdrinks[i]);

                }
                break;
            case 2:
                setTitle("Amusement");
                Integer[] mThumbidfun = {R.drawable.tv, R.drawable.videogame,
                        R.drawable.market, R.drawable.movie,
                        R.drawable.music, R.drawable.magazine};
                String[] imgtextfun = {"Regarder la télé", "Jeux vidéo", "Magasin"
                        , "Cinéma", "Musique", "Magazine"};
                String[] speechfun = {"Je veux regarder la télé", "Je veux jouer un jeux vidéo", "Je veux aller au magasin", "Je veux aller au cinéma",
                        "Je veux écouter de la musique", "Je veux lire un magazine"};
                for (int i = 0; i < mThumbidfun.length; i++) {
                    mThumbids.add(mThumbidfun[i]);
                    imgtexts.add(imgtextfun[i]);
                    speecharray.add(speechfun[i]);

                }
                break;

            case 3:
                setTitle("Médical");
                Integer[] mThumbidmed = {R.drawable.toothache, R.drawable.runnynose,
                        R.drawable.earpain, R.drawable.headache,
                        R.drawable.stomachache, R.drawable.stethescope,
                        R.drawable.cold, R.drawable.hot,
                        R.drawable.fine};
                String[] imgtextmed = {"Mal de dents", "Nez qui coule", "Mal a l'oreille"
                        , "Mal dans le corps", "Mal au ventre", "Docteur",
                        "Avoir froid", "Avoir chaud", "Je vais bien"};
                String[] speechmedical = {"J'ai mal aux dents", "J'ai le nez qui coule", "J'ai mal à l'oreille",
                        "J'ai mal au corps", "J'ai mal au ventre", "Je ne vais pas bien. Je veux voir le docteur",
                        "J'ai froid", "J'ai chaud", "Je vais bien"};
                for (int i = 0; i < mThumbidmed.length; i++) {
                    mThumbids.add(mThumbidmed[i]);
                    imgtexts.add(imgtextmed[i]);
                    speecharray.add(speechmedical[i]);
                }
                break;
            case 4:
                setTitle("Voyages");
                Integer[] mThumbidtravel = {R.drawable.aeroplane, R.drawable.train,
                        R.drawable.taxi, R.drawable.boat,
                        R.drawable.mountain, R.drawable.sea};
                String[] imgtexttravel = {"Avion", "Train", "Voiture"
                        , "Bateau", "Montagne", "Mer"};
                String[] speechtravel = {"Je veux aller dans l'avion", "Je veux aller dans le train", "Je veux aller dans la voiture"
                        , "Je veux faire du bateau", "Je veux aller à la montagne", "Je veux aller à la mer"};
                for (int i = 0; i < mThumbidtravel.length; i++) {
                    mThumbids.add(mThumbidtravel[i]);
                    imgtexts.add(imgtexttravel[i]);
                    speecharray.add(speechtravel[i]);

                }
                break;
            case 5:
                setTitle("Jeux");
                Integer[] mThumbidgames = {R.drawable.swimming, R.drawable.carrom,
                        R.drawable.cards, R.drawable.videogame,
                        R.drawable.dames};
                String[] imgtextgames = {"Natation", "Dames", "Cartes"
                        , "Jeux vidéo", "Dames"};
                String[] speechgames = {"Je veux aller nager", "Je veux jouer aux dames", "Je veux jouer aux cartes",
                        "Je veux jouer aux jeux vidéo", "Je veux jouer aux dames"};
                for (int i = 0; i < mThumbidgames.length; i++) {
                    mThumbids.add(mThumbidgames[i]);
                    imgtexts.add(imgtextgames[i]);
                    speecharray.add(speechgames[i]);

                }
                break;
            case 6:
                setTitle("Emotions");
                Integer[] mThumbidemo = {R.drawable.happy, R.drawable.sad,
                        R.drawable.love, R.drawable.angry,
                        R.drawable.confused, R.drawable.bored,
                        R.drawable.embarassed};
                String[] imgtextemo = {"Heureux", "Triste", "Je t'aime"
                        , "En colère", "Confus", "Ennuis",
                        "Gêné"};
                String[] speechemotions = {"Je suis heureux", "Je suis triste", "Je t'aime", "Je suis en colere",
                        "Je suis confus", "Je m'ennuie", "Je suis gene"};
                for (int i = 0; i < mThumbidemo.length; i++) {
                    mThumbids.add(mThumbidemo[i]);
                    imgtexts.add(imgtextemo[i]);
                    speecharray.add(speechemotions[i]);

                }
                break;
            case 7:
                setTitle("Besoins journaliers");
                Integer[] mThumbiddn = {R.drawable.toilet, R.drawable.bath,
                        R.drawable.cloth, R.drawable.nocloth,
                        R.drawable.sleep, R.drawable.nosleep,
                        R.drawable.brush, R.drawable.handwash,
                        R.drawable.shoe};
                String[] imgtextdn = {"Toilettes", "Douche", "Vêtements"
                        , "Pas ces vêtements", "Dormir", "Pas dormir",
                        "Brosser", "Laver les mains", "Chaussures"};
                String[] speechdn = {"Je veux aller aux toilettes", "Je veux prendre une douche", "Je veux me changer",
                        "Je ne veux pas porter ces vêtements", "Je veux dormir", "Je n'ai pas sommeil",
                        "Je veux me brosser les dents", "Je veux me laver les mains", "Puis-je avoir mes chaussures?"};
                for (int i = 0; i < mThumbiddn.length; i++) {
                    mThumbids.add(mThumbiddn[i]);
                    imgtexts.add(imgtextdn[i]);
                    speecharray.add(speechdn[i]);

                }
                break;
            case 8:
                setTitle("Ma chambre");
                Integer[] mThumbidroom = {R.drawable.fanon, R.drawable.fanoff,
                        R.drawable.onlight, R.drawable.offlight,
                        R.drawable.cleanfloor, R.drawable.dooropen,
                        R.drawable.doorclose, R.drawable.windowopen,
                        R.drawable.windowclose};
                String[] imgtextroom = {"Allumer le ventilateur", "Etteindre le ventilateur", "Allumer la lumière"
                        , "Etteindre la lumière", "Nettoyer le sol", "Ouvrir la porte",
                        "Fermer la porte", "Ouvrir la fenêtre", "Fermer la fenêtre"};
                String[] speechroom = {"Allumer le ventilateur s'il vous plaît", "Etteindre le ventilateur s'il vous plaît", "Allumer la lumière s'il vous plaît"
                        , "Etteindre la lumière s'il vous plaît", "Nettoyer le sol s'il vous plaît", "Ouvrir la porte s'il vous plaît",
                        "Fermer la porte s'il vous plaît", "Ouvrir la fenêtre s'il vous plaît", "Fermer la fenêtre s'il vous plaît"};
                for (int i = 0; i < mThumbidroom.length; i++) {
                    mThumbids.add(mThumbidroom[i]);
                    imgtexts.add(imgtextroom[i]);
                    speecharray.add(speechroom[i]);

                }
                break;
        }
        ////
        new CategoryGridAdapter(mThumbids, imgtexts);
        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.FRANCE);
                }
            }
        });
        GridView gv = (GridView) findViewById(R.id.gridView);
        gv.setAdapter(new CategoryGridAdapter(this));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                t1.speak(speecharray.get(i), TextToSpeech.QUEUE_FLUSH, null);

            }
        });
    }

    public void back(View view) {

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}

