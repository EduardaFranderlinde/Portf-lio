package com.example.litteltestevocacional2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdaptadorC extends FragmentStateAdapter{
    public AdaptadorC(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public AdaptadorC(@NonNull Fragment fragment) {
        super(fragment);
    }

    public AdaptadorC(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new CursoC();
            case 2:
                return new FamosoC();
        }
        return new ResultadoC();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
