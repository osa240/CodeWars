package serhii.codewars.cw20211015;

public class Kata {
  public static boolean isAValidMessage(String message) {
    int count = 0;
    int tmpNumber = 0;
    for (int i = 0; i < message.length(); i++) {
      if (Character.isDigit(message.charAt(i))) {
        if (i != 0 && Character.isDigit(message.charAt(i - 1))) {
          tmpNumber = tmpNumber * 10 + Integer.parseInt(String.valueOf(message.charAt(i)));
          continue;
        }
        if (tmpNumber != count) {
          return false;
        }
        tmpNumber = Integer.parseInt(String.valueOf(message.charAt(i)));
        count = 0;
      } else {
        count++;
      }
      if (i == message.length() - 1 && tmpNumber != count) {
        return  false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(Kata.isAValidMessage("194wPotDrSaHTzWqSUsxJsNtZsYfdtHalyjOactyAMZvBBCjwGLNQWHaUcJbgCzXOzegPkWpQJUoiRDRsoamDxzZteILDmgEMJIEqIRzkQimzXAPMGKauHSumuPVoiBiIkxoiHXYGBQSuWqgUCcxgeYTObbktTzkzpzzTCStgvJwEQhYdTjYEkSooZLOZXfBVUNMX127QsbaBBnmNAPLvrPxboWgVoIjwgEvdvGKxuMbACmeySPpmFyFWeZqVlCGjNmnAcKQvzNxELfkmTIZNnbzGUSwuQXbncggeAhXheQsWjLUDoeQVeYhTrNQXUtzXkBbOII249TSZGcZlhQJSkqeuEoXBnpkoBhYcFMMVVkZoVsovZXJQqafXSncPrnzrBOkpKPQdkwEJCbZDcNaRtVRugpulDExmUVNnLykbnxngBVAgZvWULjHZNfCkPlVFSxRRhqPRWKszjMxmvbJEGSZbsSYGcuuYzdvflTKysSvqAutomiyQwpHWfECVoZnwkZaHhldAVurgGbUgWvfIUAyRBKnwwUyMRFCIReTOMZAAgPallaSMMZWAMdaETZtYjT266UjUYeyzDgYttVsRuEfcbaGgKpkcjOKunAtoUNcWhNvnENKZpoEyjKuXtbZONXXcKEmSotNrwxawDZzSwLqaLQTOyftWOXxwvDjYvBICcTDklxlbiinfFZAZbjXtaIudcjgRlQAhNkWKkTfAlmPMKQPDQqqrcpByvnALToDRUKFJqwJPNgAUnTUsiSraKsIfzJrLQwUeteugPyGSgGzASbqEVollCTKlTEPvNrWYsWoqyLfEGJZNyNRqskRoLeIHBonjFwrFafP250CYxIpPcOPsiJezsTBXnxbNpPliAEQNjTSJFekRYUUAuiLkyNNconIsYsPeUBTbxqrwJeJVhUHrXJVjklwSmBbBaBptUHYKoroLWztMGtIfKCCMEreYpiQOeHRHTHZEZuNbFddGkkJGNjYLiqeIeDKUGDRUqYcFGsOwPZpoxmAfYzhJkduRmEJPsgokPHrlagyBuPWOSKmDkHfPrUlmfqAbJWWMVsdksdoDkkOsThkZieasQKUtuJIOPepy"));
  }
}