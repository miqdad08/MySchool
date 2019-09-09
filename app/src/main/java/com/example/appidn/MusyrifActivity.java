package com.example.appidn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MusyrifActivity extends AppCompatActivity {

    String[] Nama = {"Ust.Agus Trimusli",
            "Andri", "Haniful Iqbal", "M Husein F", "Doni Azizi", "M Iqbal Fahrezi", "Ahmad Wahfiuddin Abdurrauf", "Dzaki",};

    String[] Keterangan = {"8D Ali Bin Abi Thalib ", "Musyrif Biasa", "Kholid Bin Walid", "Saung 5 Thoriq", "Utsman Bin Affan", "Umar Bin Khattab", "Abu Bakar", "Saung 6", "SMP IDN Boarding School","SMP IDN Boarding School","SMP IDN Boarding School",};

    String [] Keterangan2 = {"agustrimuslim@gmail.com","Tidak Ada","limbawaraqah@gmail.com","huseinfadilah@gmail.com","doniazizi02@gmail.com","Tidak Ada","ahmadwahfiuddin@gmail.com","nazma0899@gmail.com"};

    String[] Keterangan3 = {"085704106642","081271957939","081275369282","081283361168","085839434388","081379388091","081373923065","081314392933"};

    String [] Keterangan4 = {"Palembang","Palembang","Aceh","Bekasi Utara","Palembang","Palembang","Palembang","Bekasi"};

    int[] gambar = {R.drawable.agus,R.drawable.idn,R.drawable.hanif,R.drawable.husein,R.drawable.idn,R.drawable.iqbal,R.drawable.idn,R.drawable.idn,};

    String idkey ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musyrif);

        idkey = getIntent().getStringExtra("key");

        ListView listView = findViewById(R.id.list_Musyrif);
        MusyrifActivity.CustomLisAdapter adapter = new CustomLisAdapter();
        listView.setAdapter(adapter);

 //       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
 //           @Override
 //           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
 //               Intent i = new Intent(MusyrifActivity.this, MusyrifActivity.class);
 //               i.putExtra("putNama", Nama[position]);
 //               startActivity(i);
 //           }
 //        });

    }

    class CustomLisAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return gambar.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.musyrif, null);

            ImageView imageView = convertView.findViewById(R.id.img);
            TextView textView = convertView.findViewById(R.id.txt_Judul);
            TextView textView1 = convertView.findViewById(R.id.txt_Keterangan);
            TextView textView2 = convertView.findViewById(R.id.txt_Keterangan2);
            TextView textView3 = convertView.findViewById(R.id.txt_Keterangan3);
            TextView textView4 = convertView.findViewById(R.id.txt_Keterangan4);

            imageView.setImageResource(gambar[position]);
            textView.setText(Nama[position]);
            textView1.setText(Keterangan[position]);
            textView2.setText(Keterangan2[position]);
            textView3.setText(Keterangan3[position]);
            textView4.setText(Keterangan4[position]);
            return convertView;

        }
    }
}
