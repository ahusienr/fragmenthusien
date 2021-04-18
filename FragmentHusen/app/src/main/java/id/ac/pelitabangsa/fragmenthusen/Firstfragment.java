package id.ac.pelitabangsa.fragmenthusen;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View
import android.view.ViewGroup;
import android.widget.Button;

public class Firstfragment extends Fragment {

    Button btnSwitch;
    boolean dual;

    public Firstfragment(){
    }
    @Override
    public View OnCreatView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        return inflater.inflate(R.layout.fragment_fragment, container, false);
    }

}
