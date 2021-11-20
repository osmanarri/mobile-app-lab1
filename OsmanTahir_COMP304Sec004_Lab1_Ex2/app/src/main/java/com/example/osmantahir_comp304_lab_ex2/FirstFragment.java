package com.example.osmantahir_comp304_lab_ex2;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FirstFragment extends Fragment {

    private Toast toast;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ListView mListView;
    private ArrayAdapter aAdapter;
    private String[] activities = { "AIActivity", "VRActivity"};

    public FirstFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        toast = Toast.makeText(getActivity().getApplicationContext(), "First Fragment Created", Toast.LENGTH_SHORT); // initiate the Toast with context, message and duration for the Toast
        toast.show(); // display the Toast

        View view = inflater.inflate(R.layout.fragment_first, container,false);
        mListView = (ListView) view.findViewById(R.id.activityList);
        aAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, activities);
        mListView.setAdapter(aAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String listItemClickedValue = activities[position].toString();
                if(listItemClickedValue == "AIActivity"){
                    Intent intent = new Intent((MainActivity) getActivity(), AIActivity.class);
                    startActivity(intent);
                }else if (listItemClickedValue == "VRActivity"){
                    Intent intent = new Intent((MainActivity) getActivity(), VRActivity.class);
                    startActivity(intent);
                }
            }
        });
        return view;
    }
    @Override
    public void onStart() {
        super.onStart();
        toast.setText("First Fragment Started");
        toast.show(); // display the Toast
    }
}
