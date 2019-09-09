package com.example.appidn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class GuruActivity extends AppCompatActivity {

    String[] Nama = {"M Abdul Aziz",
            "Suut Mulyono", "Syahrul Ulum", "Lukas Galih Azhari", "Fawwaz Daffa", "M Haidar Zamzam", "Rahman Zafran", "Salim Hartono","M Ilham Aji Setya",};

    String[] Keterangan = {"Kelas 7 A ", "Kelas 7 B", "Kelas 7 C", "Kelas 7 D", "Kelas 8 A", "Kelas 8 B", "Kelas 8 C", "Kelas 8 D","Kelas 9",};

    String [] Keterangan2 = {"mabdulaziz124@gmail.com","suutmulyono@rocketmail.com","sahrululum73@gmail.com","lucas@gmail.com","hzir.daffa@gmail.com","haidar.zamzam99@gmail.com","rahmanzafraan@gmail.com","salim.hartono@gmail.com","setyaaji07@gmail.com",};

    String[] Keterangan3 = {"081212810390","08914473387","083813013523","0895329081662","089506242545","081216012160","085694124566","085972706566","089630047842"};

    String [] Keterangan4 = {"Tangerang","Banyumas","Tangerang","Purworejo","Bekasi","Jawa Timur","Bandung","Cilacap","Semarang",};

    int[] gambar = {R.drawable.aziz,R.drawable.suut,R.drawable.ulum,R.drawable.lucas,R.drawable.daffa,R.drawable.haidar,R.drawable.zafran,R.drawable.salim,R.drawable.aji,};

    String idkey ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guru);


        idkey = getIntent().getStringExtra("key");

        ListView listView = findViewById(R.id.list_Guru);
        CustomLisAdapter adapter = new CustomLisAdapter();
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
            convertView = getLayoutInflater().inflate(R.layout.guru, null);

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
