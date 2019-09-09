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

public class SiswaActivity extends AppCompatActivity {

    String[] Nama = {"Abdullah Aghna Al-Fayyadh", "Abdullah Zidane", "Abdurrahman Raqi", "Abdurrazzaq", "Abiyyu Adiarto Sulaeman", "Ahmad Dzakki", "Ahmad Fachry Saputro", "Ahmad Fathir", "Aiyyub Al-Anshori", "Ajriel Rizqy Maulana", "Akma Zaki Alfari", "Akmal Pratama Irsyad N", "Allvin Angga Putra", "Aly Zakki Yaza", "Banyurekhsa Ghaisan", "Bryan Pradika", "Daffa Fathur Rahman", "Daffa Muhammad R", "Danish Olvan Alif D"};

    int[] Gambar = {R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn,};

    String[] Nama7B = {"Fachry Fauzan F", "Fadhil Zaki", "Farrel Ahmad Ghazali", "Fatih Ahmad Muzakki", "Fatih Rizki Akbar", "Fawwaz Abdul Ghani", "Finryar Faqiy", "Gathan Naufarrel A", "Ghaisan Raziq Syams", "Ghiyats Tamamy", "Habibie Muhaymin Ihsan", "Hauzan Nabil Mufasya", "Ichwan Ahmady Thorieq", "Ikhsan Alfharizi", "Irham Abdirrohman A", "Jagat Alif Khatulistiwa", "Khairiazzam Riefant", "M Nabil", "M Rasya Nur Baihaqi"};

    int[] Gambar7B = {R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn,};

    String[] Nama7C = {"M Umar Al Fatih", "M Aubindaffa Alaika", "M Dzakiyy Aliy Kanz", "M Fajri Lazuardi", "M Naufal Syuja Kurniawan", "Maulana Nur Fawwaz", "Meisyell Dephila Rizwani", "Mohammad Alif", "Muhammad Azka", "Muhammad Abqari Nasution", "Muhammad Fachri Razali", "Muhammad Fajri Anwar", "Muhammad Faris F", "Muhammad Alif Sulayanto", "Muhammad Myko Adityo", "Muhammad Naufal Ilham", "Muhammad Putra Raditya", "Muhammad Rafi Al Zakwan", "Muhammad Yazid Nur R", "Muhammad Zaidan Firrizq",};

    int[] Gambar7C = {R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn,};

    String[] Nama7D = {"Munawwar Zaky Ramdhan", "Murtaza Ahsan", "Musthafa Dzaki Nugraha", "Naufal Daffa Alaika", "Nawfal Althaf Budiman", "Nayaka Arvin Divandi", "Noah Alif Sjamshudi", "Panggih Bagaskoro", "Rafasatya Robbanai", "Rafa Zahran Arraziq", "Rafi Zaky Al Rizqy", "Raiyan Abizar", "Rakha Sapta Febian", "Raqin Aladar Syarief Hakim", "Ronald Edsa Pratama", "Taufik Ilhami", "Thoriq Izzudin Ramadhan", "Wildan Hanif Ihfazhirrahman", "Wildan Sabiq Abdurrahman", "Yahya Abdurrahman A",};

    int[] Gambar7D = {R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn,};

    String[] Nama8A = {"Ahmad Ihsan Maulana", "Althaaf Ridha Muhammad Zaydaan Batubara", "Daffa Arya Shofwan", "Faaris Dzaki Chandra", "Farel Fathin Nugraha", "Irsyad Sholahuddin", "Khairiansyah Hafizh", "Lalhuda Fatin Jafsyada", "Muhammad Rasya Hamdi Syahkuanza", "Nabiih Alauddin Firdaus", "Wildan Artha Sheehan",};

    int[] Gambar8A = {R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn,};

    String[] Nama8B = {"Agbi Awan Asifa", "Ali Akbar Al Amin", "Hugo Kayana Putra R", "Muhammad Attar Hafidz Erwan", "Muhammad Ficrie", "Reyhan Mohammad", "Rizaldi Kurnia Ramadhan", "Satria Hanestyo", "Sulaiman Al Hisyam",};

    int[] Gambar8B = {R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn,};

    String[] Nama8C = {"Arinal Kian R", "Azka Maulana Zikri", "Darrel Rafa Alamsyah", "Haekal Syahefiran", "Ikhsan Aydin Zahid", "Muhammad Daffa A", "Muhammad Daffa Dhiya Ulhaq", "M Nur Ahsan Rizqullah", "M Syauqi Darvestama", "Rafi Nazwan M", "Saami Sulaiman", "Safaraz Afma Affandi",};

    int[] Gambar8C = {R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn,};

    String[] Nama8D = {"Abdurrahman Wafi Adzima Ramadhan", "Ahmad Miqdad", "Ananda Gharin Sinulingga", "Harits", "Hilmi Raditya Ramadhan", "Misbah Bagaskara", "Muhammad Abiyyu Ramdhan", "Muhammad Adil Mutaqin", "Muhammad Akmal Ahsan", "Muhammad Aqsha Munggaran", "Muhammad Fadhlan Wahyudi", "Rifqi Hafidh Suryana",};

    int[] Gambar8D = {R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn, R.drawable.idn,};

    String[] Nama9 = {"Abdullah","Ali Zainal Abidin","Furqan Affuwwu H","Muhammad Afiq A","Muhammad Azhar N","Muhammad Said R","Muhammad Zein","Sidqi Athallah A","Thalhah Shafiyurrahman","Zildjidan Ramadhan S",};

    int[] Gambar9 = {R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,};


    String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);

        key = getIntent().getStringExtra("key");

        ListView listView = findViewById(R.id.list_Siswa);
        CustomLisAdapter adapter = new CustomLisAdapter();
        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent i = new Intent(SiswaActivity.this,SiswaActivity.class);
//
//                i.putExtra("putNama", Nama[position]);
//                startActivity(i);
//
//
//            }
//        });

    }

    class CustomLisAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            if (key.equals("7A")) {
                return Gambar.length;
            } else if (key.equals("7B")) {
                return Gambar7B.length;
            } else if (key.equals("7C")) {
                return Gambar7C.length;
            } else if (key.equals("7D")) {
                return Gambar7D.length;
            } else if (key.equals("8A")) {
                return Gambar8A.length;
            } else if (key.equals("8B")) {
                return Gambar8B.length;
            } else if (key.equals("8C")) {
                return Gambar8C.length;
            } else if (key.equals("8D")) {
                return Gambar8D.length;
            } else if (key.equals("9")) {
                return Gambar9.length;
            } else ;

            return 0;
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

            imageView.setImageResource(Gambar[position]);
            if (key.equals("7A")){
                textView.setText(Nama[position]);
            }else if (key.equals("7B")){
                textView.setText(Nama7B[position]);
            }else if (key.equals("7C")){
                textView.setText(Nama7C[position]);
            }else if (key.equals("7D")){
                textView.setText(Nama7D[position]);
            }else if (key.equals("8A")){
                textView.setText(Nama8A[position]);
            }else if (key.equals("8B")){
                textView.setText(Nama8B[position]);
            }else if (key.equals("8C")){
                textView.setText(Nama8C[position]);
            }else if (key.equals("8D")){
                textView.setText(Nama8D[position]);
            }else if (key.equals("9")){
                textView.setText(Nama9[position]);
            }else ;
            return convertView;

        }
    }
}

