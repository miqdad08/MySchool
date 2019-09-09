package com.example.appidn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SiswaAsramaActivity extends AppCompatActivity {

    String[] Nama7A = {"Abdullah Aghna Al Fayyadh","Abdullah Zidane","Abdurrahman Raqi","Abdurrazzaq","Abiyyu Adiarto Sulaeman","Ahmad Dzakki","Ahmad Fachry Saputro","Ahmad Fathir","Aiyyub Al-Anshori","Ajriel Rizqy Maulana",};

    int[] Gambar7A = {R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,};

    String[] Nama7B = {"M Umar Al Fatih","M Aubindaffa Alaika","M Dzakiyy Aliyy Kanz","M Fajri Lazuardi","M Naufal Syuja Kurniawan","Mohammad Alif","Muhammad Azka","Muhammad Abqary Nasution","Muhammad Fachry Razali","Muhammad Fajri Anwar",};

    int[] Gambar7B = {R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,};

    String[] Nama7C = {"Giats Thamami","Habibie Muhaymin Ihsan","Hauzan Nabil M","Ichwan Ahmadi Thoriq","Ikhsan Alfharizy","Irham Abdirrohman A","Jagat Alif Katulistiwa","Khairi Azzam R","M Nabil","M Rasya Nur Bayhaqqi",};

    int[] Gambar7C = {R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,};

    String[] Nama7D = {"Akma Zaki A","Akmal Pratama Irsyad N","Alvin Angga P","Aly Zakki Yaza","Banyureksa Ghaisan","Bryan Pradika","Daffa Fathur Rahman","Daffa Muhammad R","Danish Olvan Alif D",};

    int[] Gambar7D = {R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,};

    String[] Nama7E = {"Fadhil Zaki","Farrel Muhammad Hafidz E","Farrel Ahmad Ghazali","Fatih Ahmad Muzakki","Fatih Rizki Akbar","Fawwaz Abdul Ghani","Fihryal Faqiy","Ghatan Naufarrel A","Ghaisan Raziq Syams","Muhammad Faris F","Muhammad Hanif S","Muhammad Myko Adityo","Muhammad Naufal Ilham","Muhammad Putra Raditya","Muhammad Rafi Al Zakwan","Muhammad Yazid Nur R","Muhammad Zaidan Firrizq","Munawar Zaki Ramadhan",};

    int[] Gambar7E = {R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,};

    String[] Nama7F = {"Murtaza Ahsan","Musthafa Dzaki Nugraha","Naufal Daffa Alaika","Naufal Althaf Budiman","Nayaka Arvin Difandi","Noah Alif Sjamhudi","Panggih Bagaskoro","Rafa Satya Rabbani","Raffa Zahran Arraziq","Rafi Zaki Al Rizqi","Raiyan Abizar","Rakha Sapta Fabian","Ronald Edsa P","Taufik Ilhami","Thoriq Izzuddin R","Wildan Hanif Ihfazhirrahman","Wildan Sabiq Abdurrahman","Yahya Abdurrahman","Zirjy Zakwan Fayyadhiya",};

    int[] Gambar7F = {R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,};

    String[] Nama8A = {"Ahmad Ihsan Maulana","Althaaf Ridha Muhammad Zaydaan Batubara","Daffa Arya Shofwan","Faaris Dzaki Chandra","Farel Fathin Nugraha","Irsyad Sholahuddin","Khairiansyah Hafizh","Lalhuda Fatin Jafsyada","Muhammad Rasya Hamdi Syahkuanza","Nabiih Alauddin Firdaus","Wildan Artha Sheehan",};

    int[] Gambar8A = {R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,};

    String[] Nama8B = {"Agbi Awan Asifa","Ali Akbar Al Amin","Hugo Kayana Putra R","Muhammad Attar Hafidz Erwan","Muhammad Ficrie","Reyhan Mohammad","Rizaldi Kurnia Ramadhan","Satria Hanestyo","Sulaiman Al Hisyam",};

    int[] Gambar8B = {R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,};

    String[] Nama8C = {"Arinal Kian R","Azka Maulana Zikri","Darrel Rafa Alamsyah","Haekal Syahefiran","Ikhsan Aydin Zahid","Muhammad Daffa A","Muhammad Daffa Dhiya Ulhaq","M Nur Ahsan Rizqullah","M Syauqi Darvestama","Saami Sulaiman","Safaraz Azma Affandi",};

    int[] Gambar8C = {R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,};

    String[] Nama8D = {"Abdurrahman Wafi Adzima R","Ahmad Miqdad","Ananda Gharyn Sinulingga","Harits","Hilmi Raditya Ramadhan","Misbah Bagaskara P","Muhammad Abiyyu Ramadhan","Muhammad Adil Mutaqin","Muhammad Akmal Ahsan","Muhammad Aqsha Munggaran","Muhammad Fadhlan Wahyudi","Rifqi Hafidh Suryana",};

    int[] Gambar8D = {R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,};

    String[] Nama9 = {"Abdullah","Ali Zainal Abidin","Furqon Affuwwu H","Muhammad Afiq A","Muhammad Azhar N","Muhammad Said","Muhammad Zein","Sidqi Athallah A","Thalhah Shafiyurrahman","Zildjidan Ramadhan S",};

    int[] Gambar9 = {R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,R.drawable.idn,};



    String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa_asrama);

        key = getIntent().getStringExtra("key");

        ListView listView = findViewById(R.id.list_SiswaAsrama);
        SiswaAsramaActivity.CustomLisAdapter adapter = new CustomLisAdapter();
        listView.setAdapter(adapter);
    }
    class CustomLisAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            if (key.equals("7A")) {
                return Gambar7A.length;
            } else if (key.equals("7B")) {
                return Gambar7B.length;
            } else if (key.equals("7C")) {
                return Gambar7C.length;
            } else if (key.equals("7D")) {
                return Gambar7D.length;
            } else if (key.equals("7E")) {
                return Gambar7E.length;
            } else if (key.equals("7F")){
                return Gambar7F.length;
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

            imageView.setImageResource(Gambar7A[position]);
            if (key.equals("7A")){
                textView.setText(Nama7A[position]);
            }else if (key.equals("7B")){
                textView.setText(Nama7B[position]);
            }else if (key.equals("7C")){
                textView.setText(Nama7C[position]);
            }else if (key.equals("7D")){
                textView.setText(Nama7D[position]);
            }else if (key.equals("7E")){
                textView.setText(Nama7E[position]);
            }else if (key.equals("7F")){
                textView.setText(Nama7F[position]);
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
