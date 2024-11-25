function mousePressed() {
  frame = int(random(frameNum));  // 프레임 번호 랜덤으로 선택

  scale(random(0.1, 1.5));  // 이미지 크기 랜덤
  rotate(random(TWO_PI));   // 이미지 회전

  if (frame < 4) {
    img[frame].filter(GRAY);  // 필터 적용
  } else if (frame < 10) {
    // 필터 없이 진행
  } else if (frame < 15) {
    img[frame].filter(THRESHOLD, 0.5);  // Threshold 필터
  } else if (frame < 20) {
    img[frame].filter(BLUR, 1);  // 블러 필터
  } else {
    img[frame].filter(POSTERIZE, 4);  // 포스터라이즈 필터
  }

  imageMode(CENTER);
  image(img[frame], mouseX, mouseY);  // 마우스 클릭 위치에 이미지 그리기
  
  // println(frame);  // 이 부분을 삭제하거나 주석 처리하여 숫자 패드를 숨깁니다.
}
