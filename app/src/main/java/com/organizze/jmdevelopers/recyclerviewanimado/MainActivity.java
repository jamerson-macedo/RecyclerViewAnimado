package com.organizze.jmdevelopers.recyclerviewanimado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Item> items;
    private ItemAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        getSupportActionBar().hide();
        // removendo a action bar a TOOLBAR



        items=new ArrayList<>();

        items.add(new Item("NJDSFNJOFDSANDFSNJSDFAJNODFASNJODFJNOSFDJNOSDAFNOJDFSONJFSDANJASFDOJSDA","jamerson macedo","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("bom dia","FDFGSGSDFFSDFFGGFFSD","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("joao","ndfssdf","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","nsdjnfsdjfn","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","nsdjnfsdjfn","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","nsdjnfsdjfn","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","nsdjnfsdjfn","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","nsdjnfsdjfn","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","nsdjnfsdjfn","01-09-1997",R.drawable.maxresdefault));
        items.add(new Item("sdnfsdnifid","nsdjnfsdjfn","01-09-1997",R.drawable.maxresdefault));
        // adapter
        adapter=new ItemAdapter(this,items);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        
    }
}
