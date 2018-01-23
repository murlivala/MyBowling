package bowling.mock.mybowling.presenter;


import android.content.Context;
import android.os.Handler;

import bowling.mock.mybowling.service.BowlingService;
import bowling.mock.mybowling.Constants;
import bowling.mock.mybowling.model.Score;

/**
 * Created by Murlivala on 23/01/2018.
 */

public class ScorePresenter {
    private Handler uiHandler;
    private BowlingService bowlingService;
    private Context mContext;
    ScorePresenter(Context context){
        mContext = context;
        bowlingService = new BowlingService(context,this);
    }

    public void setUiHandler(Handler handler){
        uiHandler = handler;
    }

    public void onResponse(int status, Score score){
        //response processing
        //update UI
        if(null == score){
            //handle error and update UI accordingly
            uiHandler.sendEmptyMessage(Constants.RESPONSE_ERROR);
        }else{
            //process score and update the screen
            uiHandler.sendEmptyMessage(Constants.UPDATE_UI);
        }
    }
}
