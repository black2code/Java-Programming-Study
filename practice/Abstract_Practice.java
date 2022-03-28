package practice;

// 아래 Device 추상 클래스를 이용하여
// UsbPort1 클래스와 WiFi 클래스를 자유롭게 구현해보세요.

abstract class Device {
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

// UsbPort1 클래스
class UsbPort1 extends Device{
    UsbPort1(int id){
        this.deviceId = id;
    }
    
    @Override
    void deviceInfo() {
        System.out.println("this.deviceId = " + this.deviceId);
    }

    @Override
    void connect() {
        System.out.println("연결 하였습니다.");
    }

    @Override
    void disconnect() {
        System.out.println("연결이 해제되었습니다.");
    }

    @Override
    void send() {
        System.out.println("데이터를 전송합니다.");
    }

    @Override
    void receive() {
        System.out.println("데이터를 수신합니다.");
    }
}


// WiFi 클래스
class WiFi extends Device{
    public WiFi(int id){
        this.deviceId = id;
    }

    @Override           // 우클릭 Generate - implement Methods 오버라이딩을 해야하는 메소드 자동 생성
    void deviceInfo() {

    }

    @Override
    void connect() {

    }

    @Override
    void disconnect() {

    }

    @Override
    void send() {

    }

    @Override
    void receive() {

    }
}

public class Abstract_Practice {
    public static void main(String[] args) {
        // Test code
        UsbPort1 usb1 = new UsbPort1(1);
        WiFi wifi = new WiFi(0);
    }
}
