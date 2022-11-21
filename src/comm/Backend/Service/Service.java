package comm.Backend.Service;

import comm.*;
import comm.Backend.Banks.BankInfo;
import comm.Backend.Banks.Banks;
import comm.Database.*;
import javafx.event.ActionEvent;
import java.sql.ResultSet;
import java.util.Objects;

public class Service {

    public static double depositsum(int sum, double term) {
        Banks bank1 = new Banks();
        BankInfo[] bi = bank1.fillBankInfoArray();
        double percent = 0;
        if (Objects.equals(appControler.chenge, "1") || Objects.equals(PercentController.chenge, "1") || Objects.equals(NameController.chenge, "1")
                || Objects.equals(MinTermController.chenge, "1") || Objects.equals(MinSumController.chenge, "1")
                || Objects.equals(MaxTermController.chenge, "1") || Objects.equals(MaxSumController.chenge, "1")) {
            percent = bi[0].getPercents();
        } else if (Objects.equals(appControler.chenge, "2") || Objects.equals(PercentController.chenge, "2") || Objects.equals(NameController.chenge, "2")
                || Objects.equals(MinTermController.chenge, "2") || Objects.equals(MinSumController.chenge, "2")
                || Objects.equals(MaxTermController.chenge, "2") || Objects.equals(MaxSumController.chenge, "2")) {
            percent = bi[1].getPercents();
        } else if (Objects.equals(appControler.chenge, "3") || Objects.equals(PercentController.chenge, "3") || Objects.equals(NameController.chenge, "3")
                || Objects.equals(MinTermController.chenge, "3") || Objects.equals(MinSumController.chenge, "3")
                || Objects.equals(MaxTermController.chenge, "3") || Objects.equals(MaxSumController.chenge, "3")) {
            percent = bi[2].getPercents();
        } else if (Objects.equals(appControler.chenge, "4") || Objects.equals(PercentController.chenge, "4") || Objects.equals(NameController.chenge, "4")
                || Objects.equals(MinTermController.chenge, "4") || Objects.equals(MinSumController.chenge, "4")
                || Objects.equals(MaxTermController.chenge, "4") || Objects.equals(MaxSumController.chenge, "4")) {
            percent = bi[3].getPercents();
        } else if (Objects.equals(appControler.chenge, "5") || Objects.equals(PercentController.chenge, "5") || Objects.equals(NameController.chenge, "5")
                || Objects.equals(MinTermController.chenge, "5") || Objects.equals(MinSumController.chenge, "5")
                || Objects.equals(MaxTermController.chenge, "5") || Objects.equals(MaxSumController.chenge, "5")) {
            percent = bi[4].getPercents();
        } else if (Objects.equals(appControler.chenge, "6") || Objects.equals(PercentController.chenge, "6") || Objects.equals(NameController.chenge, "6")
                || Objects.equals(MinTermController.chenge, "6") || Objects.equals(MinSumController.chenge, "6")
                || Objects.equals(MaxTermController.chenge, "6") || Objects.equals(MaxSumController.chenge, "6")) {
            percent = bi[5].getPercents();
        } else if (Objects.equals(appControler.chenge, "7") || Objects.equals(PercentController.chenge, "7") || Objects.equals(NameController.chenge, "7")
                || Objects.equals(MinTermController.chenge, "7") || Objects.equals(MinSumController.chenge, "7")
                || Objects.equals(MaxTermController.chenge, "7") || Objects.equals(MaxSumController.chenge, "7")) {
            percent = bi[6].getPercents();
        }
        return sum + (percent * sum * term / 12) / 100;
    }

    public static double depositsumadding(int sum, double term, int SUM) {
        Banks bank1 = new Banks();
        BankInfo[] bi = bank1.fillBankInfoArray();
        double percent = 0;
        if (Objects.equals(appControler.chenge, "1") || Objects.equals(PercentController.chenge, "1") || Objects.equals(NameController.chenge, "1")
                || Objects.equals(MinTermController.chenge, "1") || Objects.equals(MinSumController.chenge, "1")
                || Objects.equals(MaxTermController.chenge, "1") || Objects.equals(MaxSumController.chenge, "1")) {
            percent = bi[0].getPercents();
        } else if (Objects.equals(appControler.chenge, "2") || Objects.equals(PercentController.chenge, "2") || Objects.equals(NameController.chenge, "2")
                || Objects.equals(MinTermController.chenge, "2") || Objects.equals(MinSumController.chenge, "2")
                || Objects.equals(MaxTermController.chenge, "2") || Objects.equals(MaxSumController.chenge, "2")) {
            percent = bi[1].getPercents();
        } else if (Objects.equals(appControler.chenge, "3") || Objects.equals(PercentController.chenge, "3") || Objects.equals(NameController.chenge, "3")
                || Objects.equals(MinTermController.chenge, "3") || Objects.equals(MinSumController.chenge, "3")
                || Objects.equals(MaxTermController.chenge, "3") || Objects.equals(MaxSumController.chenge, "3")) {
            percent = bi[2].getPercents();
        } else if (Objects.equals(appControler.chenge, "4") || Objects.equals(PercentController.chenge, "4") || Objects.equals(NameController.chenge, "4")
                || Objects.equals(MinTermController.chenge, "4") || Objects.equals(MinSumController.chenge, "4")
                || Objects.equals(MaxTermController.chenge, "4") || Objects.equals(MaxSumController.chenge, "4")) {
            percent = bi[3].getPercents();
        } else if (Objects.equals(appControler.chenge, "5") || Objects.equals(PercentController.chenge, "5") || Objects.equals(NameController.chenge, "5")
                || Objects.equals(MinTermController.chenge, "5") || Objects.equals(MinSumController.chenge, "5")
                || Objects.equals(MaxTermController.chenge, "5") || Objects.equals(MaxSumController.chenge, "5")) {
            percent = bi[4].getPercents();
        } else if (Objects.equals(appControler.chenge, "6") || Objects.equals(PercentController.chenge, "6") || Objects.equals(NameController.chenge, "6")
                || Objects.equals(MinTermController.chenge, "6") || Objects.equals(MinSumController.chenge, "6")
                || Objects.equals(MaxTermController.chenge, "6") || Objects.equals(MaxSumController.chenge, "6")) {
            percent = bi[5].getPercents();
        } else if (Objects.equals(appControler.chenge, "7") || Objects.equals(PercentController.chenge, "7") || Objects.equals(NameController.chenge, "7")
                || Objects.equals(MinTermController.chenge, "7") || Objects.equals(MinSumController.chenge, "7")
                || Objects.equals(MaxTermController.chenge, "7") || Objects.equals(MaxSumController.chenge, "7")) {
            percent = bi[6].getPercents();
        }
        return sum + SUM + (percent * (sum + SUM) * term / 12) / 100;
    }

    public static double depositsumgetack(int sum, double term, int LOad) {
        Banks bank1 = new Banks();
        BankInfo[] bi = bank1.fillBankInfoArray();
        double percent = 0;
        if (Objects.equals(appControler.chenge, "1") || Objects.equals(PercentController.chenge, "1") || Objects.equals(NameController.chenge, "1")
                || Objects.equals(MinTermController.chenge, "1") || Objects.equals(MinSumController.chenge, "1")
                || Objects.equals(MaxTermController.chenge, "1") || Objects.equals(MaxSumController.chenge, "1")) {
            percent = bi[0].getPercents();
        } else if (Objects.equals(appControler.chenge, "2") || Objects.equals(PercentController.chenge, "2") || Objects.equals(NameController.chenge, "2")
                || Objects.equals(MinTermController.chenge, "2") || Objects.equals(MinSumController.chenge, "2")
                || Objects.equals(MaxTermController.chenge, "2") || Objects.equals(MaxSumController.chenge, "2")) {
            percent = bi[1].getPercents();
        } else if (Objects.equals(appControler.chenge, "3") || Objects.equals(PercentController.chenge, "3") || Objects.equals(NameController.chenge, "3")
                || Objects.equals(MinTermController.chenge, "3") || Objects.equals(MinSumController.chenge, "3")
                || Objects.equals(MaxTermController.chenge, "3") || Objects.equals(MaxSumController.chenge, "3")) {
            percent = bi[2].getPercents();
        } else if (Objects.equals(appControler.chenge, "4") || Objects.equals(PercentController.chenge, "4") || Objects.equals(NameController.chenge, "4")
                || Objects.equals(MinTermController.chenge, "4") || Objects.equals(MinSumController.chenge, "4")
                || Objects.equals(MaxTermController.chenge, "4") || Objects.equals(MaxSumController.chenge, "4")) {
            percent = bi[3].getPercents();
        } else if (Objects.equals(appControler.chenge, "5") || Objects.equals(PercentController.chenge, "5") || Objects.equals(NameController.chenge, "5")
                || Objects.equals(MinTermController.chenge, "5") || Objects.equals(MinSumController.chenge, "5")
                || Objects.equals(MaxTermController.chenge, "5") || Objects.equals(MaxSumController.chenge, "5")) {
            percent = bi[4].getPercents();
        } else if (Objects.equals(appControler.chenge, "6") || Objects.equals(PercentController.chenge, "6") || Objects.equals(NameController.chenge, "6")
                || Objects.equals(MinTermController.chenge, "6") || Objects.equals(MinSumController.chenge, "6")
                || Objects.equals(MaxTermController.chenge, "6") || Objects.equals(MaxSumController.chenge, "6")) {
            percent = bi[5].getPercents();
        } else if (Objects.equals(appControler.chenge, "7") || Objects.equals(PercentController.chenge, "7") || Objects.equals(NameController.chenge, "7")
                || Objects.equals(MinTermController.chenge, "7") || Objects.equals(MinSumController.chenge, "7")
                || Objects.equals(MaxTermController.chenge, "7") || Objects.equals(MaxSumController.chenge, "7")) {
            percent = bi[6].getPercents();
        }
        return sum + (percent * sum * LOad / 12) / 100;
    }
}

