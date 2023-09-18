FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
  file://10-ipv4-routing.conf \
"

do_install:append() {
  install -m 0644 ${WORKDIR}/10-ipv4-routing.conf ${D}${sysconfdir}/sysctl.d/
}
