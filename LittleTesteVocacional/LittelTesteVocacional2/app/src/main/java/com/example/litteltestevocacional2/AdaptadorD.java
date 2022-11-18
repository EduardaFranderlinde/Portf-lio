package com.example.litteltestevocacional2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdaptadorD extends FragmentStateAdapter {
    public AdaptadorD(@NonNull FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }

    public AdaptadorD(@NonNull Fragment fragment){
        super(fragment);
    }

    public AdaptadorD(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle){
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new CursoD();
            case 2:
                return new FamosoD();
        }
        return new ResultadoD();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
