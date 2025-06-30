class PoliceStation {
    static String stationName;
    static int totalCells;
    static boolean isEmergencyActive;
    static double stationArea;
    static char stationGrade;
    static byte totalFloors;
    static short numberOfDesks;
    static long landlineNumber;
    static float stationBudget;
    static StringBuilder officerNotes;
    static StringBuffer radioMessages;
    static Integer backupUnits;
    static Double stationAltitude;
    static Boolean isUnderSurveillance;
    static Character shiftCode;
    static Short cellBlock;
    static Byte sirenCode;
    static Long patrolFrequency;
    static Float averageResponseTime;
    static Object evidenceLocker;

    public static void main(String[] args) {
        System.out.println(stationName);
        stationName = "Indiranagar PS";
        System.out.println(stationName);

        System.out.println(totalCells);
        totalCells = 12;
        System.out.println(totalCells);

        System.out.println(isEmergencyActive);
        isEmergencyActive = true;
        System.out.println(isEmergencyActive);

        System.out.println(stationArea);
        stationArea = 3456.78;
        System.out.println(stationArea);

        System.out.println(stationGrade);
        stationGrade = 'A';
        System.out.println(stationGrade);

        System.out.println(totalFloors);
        totalFloors = 3;
        System.out.println(totalFloors);

        System.out.println(numberOfDesks);
        numberOfDesks = 25;
        System.out.println(numberOfDesks);

        System.out.println(landlineNumber);
        landlineNumber = 8022245566L;
        System.out.println(landlineNumber);

        System.out.println(stationBudget);
        stationBudget = 15.75f;
        System.out.println(stationBudget);

        System.out.println(officerNotes);
        officerNotes = new StringBuilder("Shift change at 6 PM");
        System.out.println(officerNotes);

        System.out.println(radioMessages);
        radioMessages = new StringBuffer("All units, proceed to sector 9");
        System.out.println(radioMessages);

        System.out.println(backupUnits);
        backupUnits = 4;
        System.out.println(backupUnits);

        System.out.println(stationAltitude);
        stationAltitude = 920.45;
        System.out.println(stationAltitude);

        System.out.println(isUnderSurveillance);
        isUnderSurveillance = false;
        System.out.println(isUnderSurveillance);

        System.out.println(shiftCode);
        shiftCode = 'N';
        System.out.println(shiftCode);

        System.out.println(cellBlock);
        cellBlock = 7;
        System.out.println(cellBlock);

        System.out.println(sirenCode);
        sirenCode = 1;
        System.out.println(sirenCode);

        System.out.println(patrolFrequency);
        patrolFrequency = 12L;
        System.out.println(patrolFrequency);

        System.out.println(averageResponseTime);
        averageResponseTime = 4.5f;
        System.out.println(averageResponseTime);

        System.out.println(evidenceLocker);
        evidenceLocker = "Locker A-12";
        System.out.println(evidenceLocker);
    }
}
