public class AllCapsString {
    String capStr;

    public AllCapsString(String str) {
        capStr = str.toUpperCase();
    }

    public String getCapStr() {
        return capStr;
    }

    public void setCapStr(String capStr) {
        this.capStr = capStr.toUpperCase();
    }
}
