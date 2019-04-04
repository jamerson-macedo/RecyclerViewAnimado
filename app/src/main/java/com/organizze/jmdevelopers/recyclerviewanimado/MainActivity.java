package com.organizze.jmdevelopers.recyclerviewanimado;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Item> items;
    private ItemAdapter adapter;
    private FloatingActionButton floatingActionButton;
    boolean isDark=false;
    ConstraintLayout constraintLayout;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        floatingActionButton=findViewById(R.id.fab);
        constraintLayout=findViewById(R.id.constraint);

        getSupportActionBar().hide();
        // removendo a action bar a TOOLBAR



        items=new ArrayList<>();

        /// carregar o thema
        isDark=gettheme();
        if(isDark){
            constraintLayout.setBackgroundColor(getResources().getColor(R.color.preto));



        }else{
            constraintLayout.setBackgroundColor(getResources().getColor(R.color.branco));


        }




        items.add(new Item("NJDSFNJOFDSANDFSNJSDFAJNODFASNJODFJNOSFDJNOSDAFNOJDFSONJFSDANJASFDOJSDA","Jamerson Macedo","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("bom dia","FDFGSGSDFFSDFFGGFFSD","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("asdmfiasofmasdoifmasdoifmasdoifmasdiofmasdiofmasdiomfasdiofm","ndfssdf","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","Macedo","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","Arajo ","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","idsoasodos sobre asidnsiad","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","nsdjnfsdjfn","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","nsdjnfsdjfn","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","nsdjnfsdjfn","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","nsdjnfsdjfn","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("NJDSFNJOFDSANDFSNJSDFAJNODFASNJODFJNOSFDJNOSDAFNOJDFSONJFSDANJASFDOJSDA","Jamerson Macedo","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("NJDSFNJOFDSANDFSNJSDFAJNODFASNJODFJNOSFDJNOSDAFNOJDFSONJFSDANJASFDOJSDA","Jamerson Macedo","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("NJDSFNJOFDSANDFSNJSDFAJNODFASNJODFJNOSFDJNOSDAFNOJDFSONJFSDANJASFDOJSDA","Jamerson Macedo","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("NJDSFNJOFDSANDFSNJSDFAJNODFASNJODFJNOSFDJNOSDAFNOJDFSONJFSDANJASFDOJSDA","Jamerson Macedo","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("NJDSFNJOFDSANDFSNJSDFAJNODFASNJODFJNOSFDJNOSDAFNOJDFSONJFSDANJASFDOJSDA","Jamerson Macedo","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("NJDSFNJOFDSANDFSNJSDFAJNODFASNJODFJNOSFDJNOSDAFNOJDFSONJFSDANJASFDOJSDA","Jamerson Macedo","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("NJDSFNJOFDSANDFSNJSDFAJNODFASNJODFJNOSFDJNOSDAFNOJDFSONJFSDANJASFDOJSDA","Jamerson Macedo","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("NJDSFNJOFDSANDFSNJSDFAJNODFASNJODFJNOSFDJNOSDAFNOJDFSONJFSDANJASFDOJSDA","Jamerson Macedo","01-09-1997",R.drawable.maxresdefault));

        // adapter
        adapter=new ItemAdapter(this,items,isDark);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isDark=!isDark;
                if(isDark){
                    constraintLayout.setBackgroundColor(getResources().getColor(R.color.preto));

                }else {

                    constraintLayout.setBackgroundColor(getResources().getColor(R.color.branco));

                }
                 adapter=new ItemAdapter(getApplicationContext(),items,isDark);
                recyclerView.setAdapter(adapter);
                salvartema(isDark);

            }
        });
    }

    private void salvartema(boolean isDark) {
        SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("mypref",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putBoolean("isdark",isDark);
        editor.commit();

    }
    private boolean gettheme(){
        SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("mypref",MODE_PRIVATE);
        boolean isdark=sharedPreferences.getBoolean("isdark", false);
        return isdark;





    }
}
