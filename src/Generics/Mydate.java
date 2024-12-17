package Generics;

/**
 * 我亦无他，惟手熟尔
 */
public class Mydate {
        private int year;
        private int month;
        private int day;
        public Mydate(int year, int month, int day) {
            this.year = year;
            this.month=month;
            this.day=day;
        }
        @Override
        public String toString() {
            return "MyDate{" +
                    "year=" + year +
                    ", month=" + month +
                    ", day=" + day +
                    '}';
        }
        public int getYear() {
            return year;
        }
        public int getMonth() {
            return month;
        }
        public int getDay() {
            return day;
        }
}
