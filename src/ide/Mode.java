package ide;

/**
 * Mode are divided two modes, running mode and viewing mode.
 * running mode means IDE Component can execute function and can receive from user
 * viewing mode means that user only viewing the procedure of function or guide statements.
 */
public enum Mode {

    indNOTFILE (0x11),
    indHAVEFILE(0x12),

    indERROR(0x1D),
    indHELP(0x1E),
    indVER(0x1F),

    fileNOTFILE(0x21),
    fileHAVESEL(0x22),
    fileHAVEUP(0x23),
    fileHAVEUPSEL(0x24),

    fileLIST(0x25),
    fileSEL(0x26),

    fileERROR(0x2D),
    fileHELP(0x2E),
    fileVER(0x2F),

    compileNOTHAVE(0x31),
    compileHAVE(0x32),
    compileC(0x33),
    compileJAVA(0x34),
    compileSIC(0x35),

    compileERROR(0x3D),
    compileHELP(0x3E),
    compileVER(0x3F),

    managerNOTHAVE(0x41),
    managerHAVE(0x42),

    runnerNOTHAVE(0x51),
    runnerHAVE(0x52),
    runnerError(0x53),
    ;

    Mode (int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }

    private final int value;
}