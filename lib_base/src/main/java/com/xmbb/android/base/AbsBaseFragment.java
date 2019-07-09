package com.xmbb.android.base;
import androidx.fragment.app.Fragment;

public class AbsBaseFragment<T extends BaseEnv> extends Fragment {
    private T env;

    @Override
    public void onDetach() {
        super.onDetach();
        env = (T) ((AbsBaseActivity) getActivity()).getEnv();
    }

    protected T getEnv() {
        if (isDetached()) {
            return env;
        } else {
            throw new RuntimeException("you can't call getEnv before detached!");
        }
    }
}
