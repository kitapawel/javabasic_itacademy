package Week5.phone;

public class MobilePhoneTester {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("Huawei", "P10", 100, 1000);

        m1.InstallApp("Angry Birds", 200);
        m1.InstallApp("YouTube", 300);
        m1.InstallApp("Call of Duty", 600);

        m1.UseApp("FaceBook", 5);
        m1.UseApp("Houlu", 6);
        m1.UseApp("Twitter", 4);
        m1.UseApp("YouTube",6);
        m1.Charge();
        m1.UseApp("YouTube",6);

    }
}
