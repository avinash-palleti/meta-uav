SUMMARY = "MAVLink micro air vehicle marshalling / communication library"
HOMEPAGE = "http://qgroundcontrol.org/mavlink/"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

PV = "1.0.9"
SRCREV = "198849ff058daa50a15d3d6ed2adf2fda5de1cc2"
SRC_URI = "git://github.com/mavlink/mavlink.git \
           file://0001-mavgen_c.py-0.9-has-no-mavlink_conversions.h-file.patch \
          "

S = "${WORKDIR}/git"

inherit cmake pythonnative

PARALLEL_MAKE = ""
OECMAKE_SOURCEPATH = "${S}"
OECMAKE_BUILDPATH = "${S}/build-${TARGET_ARCH}-${PV}"

FILES_${PN} += "${datadir}/pyshared"
