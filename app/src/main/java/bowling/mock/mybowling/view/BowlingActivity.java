package bowling.mock.mybowling.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import bowling.mock.mybowling.application.BowlingApp;
import bowling.mock.mybowling.Constants;
import bowling.mock.mybowling.R;
import bowling.mock.mybowling.presenter.ScorePresenter;

public class BowlingActivity extends AppCompatActivity {

    private ScorePresenter scorePresenter;
    private Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bowling);
        scorePresenter = ((BowlingApp) getApplication()).getScorePresenter();

        mHandler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(Message inputMessage) {
                switch(inputMessage.what){
                    case Constants.UPDATE_UI:
                        updateScreen();
                        break;
                    case Constants.RESPONSE_ERROR:
                        //show error dialog or toast here if need be
                        break;
                    default:
                            /*
                             * Pass along other messages from the UI
                             */
                        super.handleMessage(inputMessage);
                }
            }
        };
        scorePresenter.setUiHandler(mHandler);

    }

    private void updateScreen(){
        //update UI
    }


}
