package objectOrientation1;

public class smartPhone {


    public class Account {
//フィールド
        String name;
        String tel;
        String email;
        String address;

//コントラスタ
        public Account(String name, String tel) {
            this.name = name;
            this.tel = tel;
            this.email = email;
            this.address = address;
        }

//メソッド
        public String getAccountInfo() {
            return "name : " + name + "\ntel: " + tel + "\nemail: " + email + "\naddress: " + address;
        }
    }

    public class AddressBook {
//フィールド
        String name;
        String tel;
        String email;

//コントラスタ
        public AddressBook(String name, String tel, String email) {
            this.name = name;
            this.tel = tel;
            this.email = email;
        }
    }

    public class SmartPhone {
//フィールド
        String model;
        String os;
        Account account;
        AddressBook[] addressBooks;
        String[] apps;

//コントラスタ
        public SmartPhone(String model, String os) {
            this.model = model;
            this.os = os;
        }

//メソッド1
        public void setAccount(Account account) {
            this.account = account;
        }

//メソッド2
        public void displayDeviceInfo() {
            System.out.println("Model: " + model);
            System.out.println("OS: " + os);
        }

//メソッド3
        public void displayMyAccount() {
            System.out.println("account: " + account);
        }

//メソッド4
        public boolean addAddressBook(AddressBook addressBook) {
            for(int i = 0 ; i < addressBooks.length ; i++){
                if (addressBooks[i]==null){
                    addressBooks[i]=addressBook;
                    return true;
                }
            }
        return false;
        }

//メソッド5
        public void displayAppList(){
            System.out.println("Apps一覧");
            for(String app : apps){
                System.out.println("- " + app);
            }
        }

    }
/*
    public class Main {
        public static void main(String[] args) {
            // SmartPhoneインスタンスの作成
            SmartPhone smartPhone = new SmartPhone("iPhone X", "iOS");

            // Accountインスタンスの作成
            Account account = new Account("example@example.com", "password");

            // AddressBookインスタンスの作成
            AddressBook addressBook1 = new AddressBook("John", "Doe", "john@example.com");
            AddressBook addressBook2 = new AddressBook("Jane", "Doe", "jane@example.com");

            // SmartPhoneのaddAddressBookメソッドを使ってAddressBookを追加
            boolean result1 = smartPhone.addAddressBook(addressBook1);
            boolean result2 = smartPhone.addAddressBook(addressBook2);

            // addAddressBookの結果を出力
            if (result1) {
                System.out.println("AddressBook1 was added to SmartPhone's AddressBook.");
            } else {
                System.out.println("Failed to add AddressBook1 to SmartPhone's AddressBook.");
            }

            if (result2) {
                System.out.println("AddressBook2 was added to SmartPhone's AddressBook.");
            } else {
                System.out.println("Failed to add AddressBook2 to SmartPhone's AddressBook.");
            }

            // SmartPhoneのdisplayDeviceInfoメソッドを呼び出し、デバイス情報を表示
            smartPhone.displayDeviceInfo();

            // SmartPhoneのdisplayAppListメソッドを呼び出し、インストールされたアプリ一覧を表示
            smartPhone.displayAppList();
        }
    }
*/

}
