package com.company.professions;
        import oop.Person;

        public class Driver extends Person{
            private int experience;

            public Driver(String fullName, int age, boolean retired, int experience) {
                super(fullName, age, retired);
                this.experience = experience;
            }

            public int getExperience() {
                return experience;
            }

            public void setExperience(int experience) {
                this.experience = experience;
            }

            @Override
            public String toString() {
                return "Driver(" +
                        "experience='" + experience + '\'' +
                        ") " + super.toString();
            }
        }
