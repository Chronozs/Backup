def tambah(input_1, input2):
    return input_1 + input2

def kurang(input_1, input_2):
    return input_1 - input_2

def kali(input_1, input_2):
    return input_1 * input_2

def bagi(input_1, input_2):
    if input_2 == 0:
        return "Error! Input tidak dapat dijalankan."
    else:
        return input_1 / input_2

def kalkulator():
    print("Operasi yang Tersedia:")
    print("1. Penjumlahan")
    print("2. Pengurangan")
    print("3. Perkalian")
    print("4. Pembagian")
    
    input_operasi = input("Masukkan pilihan [1|2|3|4]= ")
    
    input_1 = float(input("Masukkan angka pertama: "))
    input_2 = float(input("Masukkan angka kedua: "))
    
    if input_operasi == '1':
        hasil = str(tambah(input_1, input_2))
        print("Hasil: " +hasil)
    elif input_operasi == '2':
        hasil = str(kurang(input_1, input_2))
        print("Hasil: " +hasil)
    elif input_operasi == '3':
        hasil = str(kali(input_1, input_2))
        print("Hasil: " +hasil)
    elif input_operasi == '4':
        hasil = str(bagi(input_1, input_2))
        print("Hasil: " +hasil)
    else:
        print("Pilihan Error/Tidak Valid, Silahkan Input Ulang.")

kalkulator()
