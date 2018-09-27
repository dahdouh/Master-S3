#ifndef __ATOME__TRUE__H__
#define __ATOME__TRUE__H__

#include <iostream>
#include "Atome.h"

class True : public Atome{
 public:
  True();
  void print(std::ostream s);
  bool isTrue();
};

#endif
