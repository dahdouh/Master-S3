#ifndef __ATOME__FALSE__H__
#define __ATOME__FALSE__H___

#include <iostream>
#include "Atome.h"

class False : public Atome{
 public:
  False();
  bool isFalse();
  void print(std::ostream s);
};

#endif
