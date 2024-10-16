# android-signup# android-signup

## 기능 요구 사항
- [x] 디자인 시안을 참고하여 회원가입 뷰를 구현한다.
- [x] 디자인 시안을 참고하여 회원가입 뷰에 유효성 검사 로직을 추가한다.
  - [x] 이름은 2~5자여야 합니다.
  - [x] 이름에는 숫자나 기호가 포함될 수 없습니다.
  - [x] 이메일은 @를 포함해야 합니다.
  - [x] 비밀번호는 8~16자여야 합니다.
  - [x] 비밀번호는 영문과 숫자를 포함해야 합니다.
  - [x] 비밀번호와 비밀번호 확인 값이 일치해야 합니다.
  - [x] 디자인 시안을 참고하여 모든 필드가 에러 없이 채워진 경우에만 Sign up 버튼을 활성화한다.
  - [ ] (선택사항) Sign up 버튼을 클릭하면 회원가입 완료 스낵바가 노출된다.

## 프로그래밍 요구 사항
- [x] ViewModel, Hilt 등은 회원가입 미션에서 활용하지 않는다. 컴포즈 학습에 집중하자.
- [x] 사용자 입력 및 유효성 검사에 대해서는 이 단계에서 고민하지 않아도 된다.
- [x] 컴포저블 함수가 너무 많은 일을 하지 않도록 분리하기 위해 노력해 본다.
- [x] Material3 Button, TextField를 활용한다.
- [ ] 유효성 검사 로직에 대한 테스트 코드를 추가한다.
- [ ] 유효성 검사 로직과 뷰 로직을 나누어 관심사를 분리한다.
- [ ] 모든 로직에 테스트 코드를 추가한다.
- [ ] 테스트 가능한 부분과 테스트하기 힘든 부분을 분리해 테스트 가능한 부분에 대해서만 테스트를 진행한다.
