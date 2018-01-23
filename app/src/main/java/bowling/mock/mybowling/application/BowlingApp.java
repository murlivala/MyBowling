package bowling.mock.mybowling.application;

import android.app.Application;

import bowling.mock.mybowling.presenter.ScorePresenter;

/**
 * Created by Murlivala on 23/01/2018.
 */

public class BowlingApp extends Application {
    private ScorePresenter scorePresenter;
    @Override
    public void onCreate(){
        super.onCreate();
        scorePresenter = new ScorePresenter(getApplicationContext());
    }

    public ScorePresenter getScorePresenter(){
        return scorePresenter;
    }
}
