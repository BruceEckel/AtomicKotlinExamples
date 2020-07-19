// Reification/College.cpp

class College {
  public:
    void course() {}
    void thesis() {}
};

class ClownCollege {
  public:
    void pieThrowing() {}
    void tinyTricycleRiding() {}
    void thesis() {}
};

template <class T> void graduate(T t) {
  t.thesis();
}

int main() {
  graduate(College());
  graduate(ClownCollege());
}
