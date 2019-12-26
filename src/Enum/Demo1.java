package Enum;

public class Demo1 {
    public static void main(String[] args) {
        Gender male = Gender.MALE;
        System.out.println(male.getInfo());
        male.speak();

        WeekDay sun = WeekDay.SUN;
        System.out.println(sun.getInfo());

    }
}


enum Gender {
    MALE("男") {
        @Override
        public void speak() {
            System.out.println("是男人");
        }
    },
    FEMALE {
        @Override
        public void speak() {
            System.out.println("是女人");
        }
    };

    // 成员变量
    private String info;

    // 构造函数
    private Gender() {

    }

    private Gender(String info) {
        this.info = info;
    }

    // 成员方法
    public String getInfo() {
        return info;
    }

    public abstract void speak();

}
enum WeekDay {
    MON {

        @Override
        public String getInfo() {

            return "星期一";
        }

    },
    TUE {
        @Override
        public String getInfo() {

            return "星期二";
        }
    },
    WED {
        @Override
        public String getInfo() {

            return "星期三";
        }
    },
    THU {
        @Override
        public String getInfo() {

            return "星期四";
        }
    },
    FRI {
        @Override
        public String getInfo() {

            return "星期五";
        }
    },
    SAT {
        @Override
        public String getInfo() {

            return "星期六";
        }
    },
    SUN {
        @Override
        public String getInfo() {

            return "星期天";
        }
    };
    public abstract String getInfo();
}
