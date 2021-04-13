package com.example.collegeusersapp.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.collegeusersapp.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;


public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_home, container, false);
        sliderLayout = view.findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(2);

        setSliderViews();

        return view;
    }

    private void setSliderViews() {
        for (int i=0 ; i< 5 ; i++){
            DefaultSliderView sliderView=new DefaultSliderView(getContext());

            switch (i){
                case 0:
                    sliderView.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTexkTTqgx4rsECFzR_dc8xEbKrqeL_vOydtQ&usqp=CAU");
                    break;
                case 1:
                    sliderView.setImageUrl("https://www.edufever.com/wp-content/uploads/2020/05/Untitled-design-43-min.jpg");
                    break;
                case 2:
                    sliderView.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8EgVAkpkwmuBIcdI80gw6GR5k5pfRYoXdDg&usqp=CAU");
                    break;
                case 3:
                    sliderView.setImageUrl("https://www.gla.ac.in/images/academic-facilities-banner.jpg");
                    break;
                case 4:
                    sliderView.setImageUrl("https://www.edufever.com/wp-content/uploads/2020/05/Untitled-design-43-min.jpg");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.FIT_XY);

            sliderLayout.addSliderView(sliderView);
        }
    }
}