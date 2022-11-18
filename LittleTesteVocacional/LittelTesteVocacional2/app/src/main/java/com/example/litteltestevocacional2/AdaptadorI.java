package com.example.litteltestevocacional2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdaptadorI extends FragmentStateAdapter {
    public AdaptadorI(@NonNull FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }

    public AdaptadorI(@NonNull Fragment fragment){
        super(fragment);
    }

    public AdaptadorI(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle){
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new CursoI();
            case 2:
                return new FamosoI();
        }
        return new ResultadoI();
    }

    @Override
    public int getItemCount(){
        return 3;
    }
}
