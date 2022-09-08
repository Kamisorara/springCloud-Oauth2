package com.borrow.service;

import com.borrow.entity.resp.UserBorrowDetail;

public interface BorrowService {
    UserBorrowDetail getUserBorrowDetailByUid(Long uid);
}
