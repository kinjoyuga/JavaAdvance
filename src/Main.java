import oop.smartPhone.Account;
import oop.smartPhone.AddressBook;
import oop.smartPhone.SmartPhone;

public class Main {
    public static void main(String[] args) {
        // SmartPhoneクラスのインスタンスを作成
        SmartPhone myPhone = new SmartPhone("iPhone X", "iOS");

        // Accountクラスのインスタンスを作成
        Account myAccount = new Account("kinjo yuga", "08039929673", "yuga@example.com", "123 Main St");

        // AddressBookクラスのインスタンスを作成
        AddressBook addressBook1 = new AddressBook("yuga kinjo", "080 3992 9673", "yuga@example.com");

        // SmartPhoneのアカウント情報を設定
        myPhone.setAccount(myAccount);

        // SmartPhoneのアドレス帳に連絡先を追加
        boolean result = myPhone.addAddressBook(addressBook1);
        if (result) {
            System.out.println("連絡先を追加しました。");
        } else {
            System.out.println("連絡先を追加できませんでした。");
        }

        // SmartPhoneのデバイス情報を表示
        myPhone.displayDeviceInfo();

        // SmartPhoneのアカウント情報を表示
        myPhone.displayMyAccount();

        // SmartPhoneのアプリ一覧を表示
        myPhone.displayAppList();
    }
}
