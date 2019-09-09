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

public class AsramaActivity extends AppCompatActivity {

    String[] Nama = {"Kelas 7 A",
            "Kelas 7 B", "Kelas 7 C", "Kelas 7 D", "Kelas 7 E", "Kelas 7 F", "Kelas 8 A", "Kelas 8 B", "Kelas 8 C", "Kelas 8 D", "Kelas 9"};

    String[] key = {"7A","7B","7C","7D","7E","7F","8A","8B","8C","8D","9",};

    String[] Keterangan = {"SMP IDN Boarding School", "SMP IDN Boarding School", "SMP IDN Boarding School", "SMP IDN Boarding School", "SMP IDN Boarding School", "SMP IDN Boarding School", "SMP IDN Boarding School", "SMP IDN Boarding School", "SMP IDN Boarding School","SMP IDN Boarding School","SMP IDN Boarding School",};

    int[] gambar = {R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asrama);

        ListView listView = findViewById(R.id.list_Asrama);
        AsramaActivity.CustomLisAdapter adapter = new CustomLisAdapter();
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(AsramaActivity.this, SiswaAsramaActivity.class);
                i.putExtra("key", key[position]);
                startActivity(i);
            }
        });

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
            convertView = getLayoutInflater().inflate(R.layout.raw_list, null);

            ImageView imageView = convertView.findViewById(R.id.img);
            TextView textView = convertView.findViewById(R.id.txt_Judul);
            TextView textView1 = convertView.findViewById(R.id.txt_Keterangan);


            imageView.setImageResource(gambar[position]);
            textView.setText(Nama[position]);
            textView1.setText(Keterangan[position]);
            return convertView;

        }
    }
}
