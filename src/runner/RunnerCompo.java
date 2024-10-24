package runner;

import file.FileCompo;
import ide.IDEComponent;
import ide.Mode;

import java.io.File;

public class RunnerCompo extends IDEComponent {

    public RunnerCompo() {
        setMode(Mode.runnerNOTHAVE); //0x51
    }

    public RunnerCompo(File runfile, int errorFlag) {
        if(errorFlag == 0) {
            setMode(Mode.runnerHAVE); //0x52
        }else {
            setMode(Mode.runnerError); //0x53
        }
    }
    //CMD에서 엑시트 코드 받아올수 있음
    //컴파일 쪽에서 엑시트코드 받아다가 써먹으면 될듯
    //exitCode = process.waitFor();

    public void executeComponent(){
        switch (mode.getValue()) {
            case 0x51:{
                break;
            }
            case  0x52:{
                break;
            }
        }
    }

    public void showComponent() {
        switch (mode.getValue()) {
            case 0x51: {
                break;
            }
            case 0x52: {
                break;
            }
            case 0x53: {
                break;
            }
        }
    }

    public void setMode(Mode m){

    }

    File runfile = FileCompo.getUploadedFile();
    public int errorFlag;

    public RunnerRunner runnerRunner = new RunnerRunner();
    public RunnerViewer runnerViewer = new RunnerViewer();

}