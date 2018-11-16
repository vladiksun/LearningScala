package chapter_13_packages_and_imports.flexible_imports

// This imports just members Apple and Orange from object Fruits.

import chapter_13_packages_and_imports.test_imports.Fruits.{Apple, Orange}

//This imports the two members Apple and Orange from object Fruits. However, the Apple object is
//renamed to McIntosh, so this object can be accessed with either Fruits.Apple or McIntosh.

import chapter_13_packages_and_imports.test_imports.Fruits.{Apple => McIntosh, Orange}

//This imports the SQL date class as SDate, so that you can simultaneously import the normal Java date
//class as simply Date.
import java.sql.{Date => SDate}


//This imports the java.sql package as S, so that you can write things like S.Date.
import java.{sql => S}

//This imports all members from object Fruits but renames Apple to McIntosh.
import chapter_13_packages_and_imports.test_imports.Fruits.{Apple => McIntosh, _}

//This imports all members of Fruits except Pear.
import chapter_13_packages_and_imports.test_imports.Fruits.{Pear => _, _}

class ImportSelector
