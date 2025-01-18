int res = 0;
        for (int ele : derived) {
            res ^= ele;
        }
        return res == 0;
