package com.example.anemia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class JenisAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public JenisAdapter(Context context){
        this.context = context;
    }

    public int[] slide_image = {
     R.drawable.ic_one,
     R.drawable.ic_two,
     R.drawable.ic_three,
     R.drawable.ic_four,
     R.drawable.ic_five
    };

    public String[] judul = {
         "ANEMIA DEFISIENSI BESI",
         "ANEMIA MEGALOBLASTIK",
         "ANEMIA HEMOLITIK",
         "ANEMIA APLASTIK",
          "ANEMIA KRONIS"
    };

    public String[] isi = {
            "Anemia defisiensi besi atau anemia zat besi adalah anemia yang disebabkan oleh kekurangan zat besi yang berperan dalam pembentukan hemoglobin, baik karena kekurangan konsumsi atau karena gangguan absorpsi.",
            "Anemia yang disebabkan oleh defisiensi vitamin B12 dan defisiensi asam folat memperlihatkan perubahan-perubahan sumsum tulang dan darah  perifer yang identik.",
            "Anemia hemolitik terjadi apabila sel darah merah dihancurkan lebih cepat dari normal. Penyebabnya kemungkinan karena keturunan atau karena salah satu dari beberapa penyakit, termasuk leukemia dan kanker lainnya, fungsi limpa yang tidak normal, gangguan kekebalan, dan hipertensi berat.",
            "Anemia Aplastik adalah anemia yang disebabkan oleh ketidak sanggupan sum-sum tulang belakang membentuk sel darah merah dan juga faktor dari luar tubuh manusia, seperti halnya terpapar bahan kimia, terkena perawatan medis atau bahkan faktor fisik lainnya.",
            "Anemia penyakit kronis merupakan bentuk anemia derajat ringan sampai sedang yang terjadi akibat infeksi kronis, peradangan trauma atau penyakit neoplastik yang telah berlangsung 1–2 bulan dan tidak disertai penyakit hati, ginjal dan endokrin."
    };
    @Override
    public int getCount() {
        return judul.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.imageView);
        TextView slideJudul = (TextView) view.findViewById(R.id.Judul);
        TextView slideSub = (TextView) view.findViewById(R.id.Sub);

        slideImageView.setImageResource(slide_image[position]);
        slideJudul.setText(judul[position]);
        slideSub.setText(isi[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
