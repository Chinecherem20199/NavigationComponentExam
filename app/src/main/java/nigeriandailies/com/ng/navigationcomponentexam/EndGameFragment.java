package nigeriandailies.com.ng.navigationcomponentexam;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import java.util.zip.Inflater;


public class EndGameFragment extends Fragment {


    public EndGameFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_end_game, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);

        Button button = view.findViewById(R.id.restartGameButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                navController.navigate(R.id.action_endgameFragment_to_startFragment);
                NavOptions navOptions = new NavOptions.Builder().setPopUpTo(R.id.startFragment, true).build();

                navController.navigate(R.id.action_endGameFragment_to_startFragment, null, navOptions);
//                navController.navigate(R.id.action_endGameFragment_to_startFragment);
            }
        });
    }
}