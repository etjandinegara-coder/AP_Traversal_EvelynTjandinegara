4.3 h Under what conditions would a preorder and a breadth-first traversal be the same?
= PreOrder mempunyai urutan melangkah dari atas hingga ke bawah samapi leaf lalu pindah ke cabang yang lain sedangkan Breadth-First mempunyai urutan melangkah per-level dari kiri ke kanan. Jadi kondisi yang memungkinkan urutan nya sama ketika tree tidak memiliki cabang, setiap node hanya memiliki satu anak. Kondisi dimana tree berbentuk linear seperti linked list. Sehingga hasil urutannya sama.



4.3 i Suppose a directory structure has N files stored in n directories. Answer the following questions:

a. What is the run time of a traversal that prints out the directory names?
= Yang dicetak adalah runtime directory maka traversal harus mengunjungi semua directory dan itu sekali dalam satu node maka runtime nya O(n).

b. What is the run time of a traversal that prints out the file names?
= Traversal akan jalan N kali sesuai N file. Lalu untuk mengunjungi file, kita perlu masuk ke directory maka total node O(n + N) tetapi keran hanya print file maka rutime nya O(N).

c. How does your answer to Part b of this question change if you know that N= omega(n)?
= jadi dalam best case nya, runtime tetap linear karena traversal akan tetap jalan sebanayak N kali walaupun dalam best case.
# AP_Traversal_EvelynTjandinegara
