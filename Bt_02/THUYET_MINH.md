# KỊCH BẢN THUYẾT MINH QUAY VIDEO - BÀI TẬP 02
**Sinh viên:** Nguyễn Doãn Huy  
**Mã sinh viên:** BIT240115  
**Học phần:** Lập trình ứng dụng di động  
**Công nghệ:** Android Native (Kotlin)  
**Thời lượng dự kiến:** 1 phút 30 giây – 2 phút

---

## 🎬 BẢN 1: KỊCH BẢN CHI TIẾT (CÓ CHỈ DẪN HÀNH ĐỘNG KHI QUAY)

> **Gợi ý bố cục màn hình khi quay:**  
> - Nửa bên trái: Cửa sổ **Android Emulator** đang mở app Bt_02.  
> - Nửa bên phải: Cửa sổ **VS Code** mở file `MainActivity.kt`.

---

### [00:00 - 00:20] PHẦN 1: MỞ ĐẦU & GIỚI THIỆU
* **Hành động:** *(Mở sẵn màn hình VS Code bên phải và máy ảo bên trái. Bắt đầu quay)*  
* **Lời đọc:**  
> "Em xin chào thầy và các bạn!  
> Em tên là **Nguyễn Doãn Huy**, mã sinh viên **BIT240115**.  
> Hôm nay em xin phép được trình bày và giải thích bài tập số 02 của môn Lập trình ứng dụng di động."

---

### [00:20 - 00:45] PHẦN 2: YÊU CẦU ĐỀ BÀI & CÔNG NGHỆ SỬ DỤNG
* **Hành động:** *(Có thể lướt chuột qua ảnh đề bài hoặc trỏ vào project)*  
* **Lời đọc:**  
> "Theo yêu cầu của đề bài Bài 2, sinh viên cần xây dựng lại giao diện 6 ô màu nhưng phải sử dụng một công nghệ khác so với bài đã nộp ở buổi 1.  
> Ở Bài tập 1, em đã sử dụng **React Native với Expo**. Do đó, ở Bài tập 2 này, em đã chuyển đổi sang nền tảng **Android Native sử dụng ngôn ngữ Kotlin**."

---

### [00:45 - 01:20] PHẦN 3: GIẢI THÍCH CẤU TRÚC CODE (MAINACTIVITY.KT)
* **Hành động:** *(Cuộn chuột đến các đoạn code tương ứng trong file `MainActivity.kt` trên VS Code)*  
* **Lời đọc:**  
> "Về phần mã nguồn, em xây dựng toàn bộ giao diện trực quan trong file `MainActivity.kt`:  
> 
> 1. **Bố cục tổng thể:** Em sử dụng một `LinearLayout` hướng dọc (`VERTICAL`) bao trọn màn hình, đặt nền trắng và căn lề xung quanh.  
> 2. **Hai ô trên cùng:** Ô số 1 màu xanh dương và ô số 2 màu đỏ được xếp theo chiều dọc, chiếm toàn bộ chiều ngang của màn hình (`MATCH_PARENT`).  
> 3. **Hàng giữa:** Em lồng một `LinearLayout` hướng ngang (`HORIZONTAL`). Để đảm bảo 3 ô số 3, 4, 5 bằng nhau và có khoảng trống bên phải đúng như ảnh mẫu, em chia hàng này làm 4 phần bằng nhau thông qua thuộc tính `weight = 1f`. Ba phần đầu là các ô 3 (vàng), 4 (xanh lá), 5 (tím), và phần thứ tư là một thành phần `Space` rỗng.  
> 4. **Ô số 6:** Là ô màu cam ở dưới cùng, chiếm trọn bề ngang màn hình.  
> 5. **Tối ưu code:** Em tách riêng hàm `numberTile` để dùng chung cho việc khởi tạo các ô số, định dạng bo góc, kích thước chữ số 60sp và căn giữa nội dung.  
> 6. **Thông tin sinh viên:** Ở dưới cùng, em đặt một `TextView` hiển thị rõ họ tên và mã sinh viên: **Nguyễn Doãn Huy - BIT240115**."

---

### [01:20 - 01:45] PHẦN 4: DEMO TRỰC TIẾP TRÊN MÁY ẢO ANDROID
* **Hành động:** *(Chuyển chuột sang máy ảo bên trái, lần lượt click vào từng ô số)*  
* **Lời đọc:**  
> "Bây giờ em xin phép thao tác trực tiếp trên máy ảo Android:  
> Khi em chạm vào ô số 1 *(click ô 1)*, ứng dụng hiển thị thông báo: *'Đã chọn ô 1'* và có hiệu ứng phản hồi chạm nhẹ.  
> Tương tự, khi chạm vào ô số 2 *(click ô 2)*, ô số 3 *(click ô 3)*, ô 4 *(click ô 4)*, ô 5 *(click ô 5)* và ô 6 *(click ô 6)*, trạng thái lựa chọn đều được cập nhật chính xác và mượt mà ngay bên dưới tên sinh viên."

---

### [01:45 - 02:00] PHẦN 5: KẾT LUẬN
* **Hành động:** *(Nhìn vào webcam hoặc kết thúc quay màn hình)*  
* **Lời đọc:**  
> "Như vậy, giao diện đã hiển thị chính xác theo yêu cầu đề bài, đúng tỷ lệ, màu sắc và đáp ứng trọn vẹn tiêu chí đổi công nghệ sang Android Native Kotlin.  
> Em xin cảm ơn thầy đã theo dõi phần trình bày của em!"

---
---

## 🎙️ BẢN 2: BẢN ĐỌC LIỀN MẠCH (DÙNG ĐỌC MỘT LÈO TRƯỚC ỐNG KÍNH / TELEPROMPTER)

> *"Em xin chào thầy và các bạn! Em tên là **Nguyễn Doãn Huy**, mã sinh viên **BIT240115**. Hôm nay em xin phép được trình bày bài tập số 02 môn Lập trình ứng dụng di động.*  
>  
> *Đề bài yêu cầu xây dựng giao diện 6 ô màu nhưng phải đổi công nghệ so với Bài 1. Ở Bài 1 em đã làm bằng React Native, nên ở Bài 2 này em chuyển sang làm bằng Android Native với ngôn ngữ Kotlin.*  
>  
> *Về cấu trúc giao diện trong file MainActivity.kt:*  
> *Toàn bộ màn hình được bao bọc bởi một LinearLayout theo hướng dọc. Hai ô số 1 màu xanh dương và ô số 2 màu đỏ chiếm toàn bộ chiều ngang màn hình.*  
>  
> *Ở hàng giữa, em sử dụng LinearLayout theo chiều ngang. Em chia đều hàng này làm bốn phần bằng nhau với trọng số weight bằng 1. Ba phần đầu lần lượt là ô số 3 màu vàng, ô số 4 màu xanh lá và ô số 5 màu tím. Phần thứ tư là một khoảng trắng Space bên phải đúng theo thiết kế đề bài.*  
>  
> *Bên dưới là ô số 6 màu cam chiếm trọn bề ngang. Em viết riêng hàm numberTile nhận số, màu nền và màu chữ để tái sử dụng, giúp code gọn gàng, căn giữa chuẩn và bo góc tinh tế.*  
>  
> *Mỗi ô đều được gắn sự kiện click. Khi chạm vào bất kỳ ô nào, bên dưới thông tin sinh viên 'Nguyễn Doãn Huy - BIT240115' sẽ lập tức hiển thị dòng chữ 'Đã chọn ô' tương ứng kèm hiệu ứng mượt mà.*  
>  
> *Như thầy đang thấy trên máy ảo Android bên trái và mã nguồn Kotlin bên phải, ứng dụng hoạt động rất ổn định, đúng chuẩn màu sắc và tỷ lệ bố cục. Em xin cảm ơn thầy đã lắng nghe!"*
