package com.kcb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gejala penyakit diabetes, obesitas, dan paru-paru basah
        String[][] gejala = {
                // Diabetes
                {"Polyuria (sering buang air kecil)", "1"},
                {"Polydipsia (sering merasa haus)", "1"},
                {"Penurunan berat badan tanpa sebab", "1"},
                {"Lemas dan lelah", "1"},
                {"Pandangan kabur", "1"},
                {"Sering merasa lapar", "1"},
                {"Infeksi kulit yang sulit sembuh", "1"},
                {"Gatal-gatal pada area kelamin", "1"},
                {"Kencing yang sering terjadi di malam hari", "1"},
                {"Sering mengalami infeksi saluran kemih", "1"},
                {"Bau napas yang tidak sedap", "1"},

                // Obesitas
                {"Berat badan berlebih", "2"},
                {"Kegemukan", "2"},
                {"Sulit melakukan aktivitas fisik", "2"},
                {"Nafsu makan berlebihan", "2"},
                {"Sering merasa lelah", "2"},
                {"Perut buncit", "2"},
                {"Perubahan suasana hati", "2"},
                {"Masalah tidur", "2"},
                {"Sering merasa lapar meskipun baru makan", "2"},
                {"Sering mengonsumsi makanan cepat saji", "2"},
                {"Sulit berkonsentrasi", "2"},

                // Paru-paru basah
                {"Batuk berdahak", "3"},
                {"Sesak napas", "3"},
                {"Demam", "3"},
                {"Sakit dada", "3"},
                {"Nafsu makan menurun", "3"},
                {"Pilek atau hidung tersumbat", "3"},
                {"Berkeringat di malam hari", "3"},
                {"Suara napas yang berdenging", "3"},
                {"Kulit pucat atau kebiruan", "3"},
                {"Nyeri otot dan sendi", "3"},
                {"Menggigil", "3"},
        };

        System.out.println("Selamat datang di Sistem Pakar Pendeteksi Penyakit");

        List<String> gejalaTerpilih = new ArrayList<>();

        while (true) {
            System.out.println("\nPilih gejala yang Anda alami:");

            // Menampilkan gejala
            for (int i = 0; i < gejala.length; i++) {
                System.out.println((i + 1) + ". " + gejala[i][0]);
            }

            System.out.println("0. Selesai");

            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                if (gejalaTerpilih.isEmpty()) {
                    System.out.println("Anda belum memilih gejala. Terima kasih telah menggunakan Sistem Pakar Pendeteksi Penyakit.");
                } else {
                    System.out.println("\nGejala yang Anda alami:");
                    for (String gejalaPilihan : gejalaTerpilih) {
                        System.out.println("- " + gejalaPilihan);
                    }

                    System.out.println("\nPenyakit yang mungkin Anda derita:");

                    boolean diabetes = false;
                    boolean obesitas = false;
                    boolean paruBasah = false;

                    for (String[] penyakit : gejala) {
                        if (gejalaTerpilih.contains(penyakit[0])) {
                            if (penyakit[1].equals("1")) {
                                diabetes = true;
                            } else if (penyakit[1].equals("2")) {
                                obesitas = true;
                            } else if (penyakit[1].equals("3")) {
                                paruBasah = true;
                            }
                        }
                    }

                    if (diabetes) {
                        System.out.println("- Diabetes");
                    }
                    if (obesitas) {
                        System.out.println("- Obesitas");
                    }
                    if (paruBasah) {
                        System.out.println("- Paru-paru Basah");
                    }

                    System.out.println("\nTerima kasih telah menggunakan Sistem Pakar Pendeteksi Penyakit.");
                }
                break;
            } else if (pilihan >= 1 && pilihan <= gejala.length) {
                String namaGejala = gejala[pilihan - 1][0];
                gejalaTerpilih.add(namaGejala);
                System.out.println("Anda memilih gejala: " + namaGejala);
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
