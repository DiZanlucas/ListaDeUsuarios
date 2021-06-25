package com.example.listadeusuarios;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.listadeusuarios.placeholder.PlaceholderContent;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class ItemFragment extends Fragment {

    // TODO: Customize parameters
    private int mColumnCount = 1;

    int index; //index do ArrayList
    ArrayList<Usuario> usuarios = new ArrayList();

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";


    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static ItemFragment newInstance(int columnCount) {
        ItemFragment fragment = new ItemFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;

            adicionaUsuarios("Carlos","2938923","carlos@gmail.com","9343849849", 78);
            adicionaUsuarios("Jessica","12345945","jessica@gmail.com","8743849849", 34);
            adicionaUsuarios("Marcos", "993049482", "marcos@gmail.com","83463374", 23);
            adicionaUsuarios("Joana","07387870293","joana@gmail.com","9343897493", 67);
            adicionaUsuarios("Leticia","3049810834","leticia@gmail.com","873948939", 25);
            adicionaUsuarios("Felipe", "0938401943", "felipe@gmail.com","99947434", 22);
            adicionaUsuarios("João","3481938434","joao@gmail.com","93438499434", 45);
            adicionaUsuarios("Pedro","0293810983","pedro@gmail.com","884749849", 34);
            adicionaUsuarios("Astrid", "938743497", "astrid@gmail.com","8346334094", 23);
            adicionaUsuarios("Harry","38920938","harry@gmail.com","93438345", 56);
            adicionaUsuarios("Eragon","0494092493","eragon@gmail.com","874381234", 34);
            adicionaUsuarios("Katniss", "347937238", "katniss@gmail.com","83464321", 23);


            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new MyItemRecyclerViewAdapter(usuarios));
        }
        return view;
    }
    public void adicionaUsuarios(String nome, String CPF, String email, String telefone, int idade){
        Usuario user = new Usuario(nome, CPF, email, telefone, idade);
        usuarios.add(index,user);
        index++;
    }
}