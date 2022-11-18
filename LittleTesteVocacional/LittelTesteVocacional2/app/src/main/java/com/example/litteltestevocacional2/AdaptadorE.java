package com.example.litteltestevocacional2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdaptadorE extends FragmentStateAdapter{
    public AdaptadorE(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public AdaptadorE(@NonNull Fragment fragment) {
        super(fragment);
    }

    public AdaptadorE(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new CursoS();
            case 2:
                return new FamosoS();
        }
        return new ResultadoS();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
