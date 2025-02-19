def solution(rank, attendance):
    # 참석 가능한 학생들 중, 등수 기준으로 정렬
    sorted_students = sorted((r, i) for i, r in enumerate(rank) if attendance[i])

    # 상위 3명의 학생 번호 추출
    a, b, c = sorted_students[:3]

    # 점수 계산 (a * 10000 + b * 100 + c)
    return a[1] * 10000 + b[1] * 100 + c[1]